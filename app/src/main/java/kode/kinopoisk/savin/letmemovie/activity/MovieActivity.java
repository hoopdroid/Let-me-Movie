package kode.kinopoisk.savin.letmemovie.activity;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import butterknife.Bind;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.adapters.seance.SeanceRVAdapter;
import kode.kinopoisk.savin.letmemovie.components.Constants;
import kode.kinopoisk.savin.letmemovie.data.DataService;
import kode.kinopoisk.savin.letmemovie.data.models.movies.movie.SoonMovieModel;
import kode.kinopoisk.savin.letmemovie.fragment.FilmInfoFragment;
import kode.kinopoisk.savin.letmemovie.fragment.StaffFragment;
import kode.kinopoisk.savin.letmemovie.data.models.movies.movie.IMovie;
import kode.kinopoisk.savin.letmemovie.data.models.seances.MovieSeanceData;
import kode.kinopoisk.savin.letmemovie.navigator.FragmentNavigator;
import kode.kinopoisk.savin.letmemovie.util.DateUtil;
import kode.kinopoisk.savin.letmemovie.util.ImageUrlPatterMatcher;

import static android.view.View.GONE;

public class MovieActivity extends BaseActivity {

    @Bind(R.id.postImage)
    ImageView mPostImage;
    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.fab)
    FloatingActionButton mGetSeancesFab;
    @Bind(R.id.toolbar_layout)
    CollapsingToolbarLayout collapsingToolbarLayout;
    @Bind(R.id.bottom_sheet)
    NestedScrollView mBottomSheet;
    @Bind(R.id.seance_movie_RV)
    RecyclerView seanceMovieRV;
    @Bind(R.id.seanceTitleText)
    TextView mSeanceTitleText;

    @Bind(R.id.progressBarLayout)
    ViewGroup progressBarLayout;

    private boolean isBottomSheetOpened = false;

    private BottomSheetBehavior mBottomSheetBehavior;

    private IMovie mMovieModel;

    private int cityID = 490;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        mMovieModel = getIntent().getParcelableExtra(Constants.MOVIE_EXTRA);
        cityID = getIntent().getIntExtra("cityID",490);

        initViewElements();

    }

    private void initViewElements() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
           mPostImage.setTransitionName(Constants.IMAGE_TRANSITION);
        }

        mToolbar.setTitle(mMovieModel.getNameRU());
        setSupportActionBar(mToolbar);

        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        mToolbar.showOverflowMenu();


        mBottomSheetBehavior = BottomSheetBehavior.from(mBottomSheet);
        mBottomSheet.setNestedScrollingEnabled(false);
        mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        mBottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                if(newState==BottomSheetBehavior.STATE_COLLAPSED){
                    isBottomSheetOpened=false;
                    mGetSeancesFab.setImageResource(R.drawable.ticket);
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });

        mGetSeancesFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isBottomSheetOpened){
                    mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
                else {
                mGetSeancesFab.setImageResource(R.drawable.ic_action_navigation_close_inverted);
                getMovieSeance();
                mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                isBottomSheetOpened = true;}
            }
        });

        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.TextAppearance_MyApp_Title_Collapsed);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.TextAppearance_MyApp_Title_Expanded);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        seanceMovieRV.setLayoutManager(layoutManager);

        Picasso.with(this).load(ImageUrlPatterMatcher.getImageUrl(this, mMovieModel.getPosterURL()))
                .into(mPostImage);

        FragmentNavigator.showStaffFragment(this, StaffFragment.newInstance(this, mMovieModel.getId()));
        FragmentNavigator.showInfoFragment(this, FilmInfoFragment.newInstance(this, mMovieModel.getId()));


        if(mMovieModel instanceof SoonMovieModel)
            mGetSeancesFab.setVisibility(GONE);


    }


    private void getMovieSeance(){

        DataService.init().getMovieSeance(new DataService.onRequestSeanceResult() {
            @Override
            public void onRequestSeanceResult(MovieSeanceData movieSeanceData) {

                progressBarLayout.setVisibility(GONE);
                setMovieSeanceView(movieSeanceData);

            }
        },cityID,Integer.parseInt(mMovieModel.getId()), DateUtil.getTodayDate());
    }

    private void setMovieSeanceView(MovieSeanceData movieSeanceData) {
        mSeanceTitleText.setText("Сеансы "+ DateUtil.getTodayDate());
        SeanceRVAdapter adapter = new SeanceRVAdapter(MovieActivity.this,movieSeanceData.getSeanceModels());
        seanceMovieRV.setAdapter(adapter);
    }


}



