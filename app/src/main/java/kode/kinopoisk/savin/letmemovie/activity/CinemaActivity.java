package kode.kinopoisk.savin.letmemovie.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import butterknife.Bind;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.adapters.seance.SeanceItemRVAdapter;
import kode.kinopoisk.savin.letmemovie.components.Constants;
import kode.kinopoisk.savin.letmemovie.data.DataService;
import kode.kinopoisk.savin.letmemovie.data.models.cinemaInfo.CinemaDetailData;
import kode.kinopoisk.savin.letmemovie.data.models.cinemas.CinemaModel;
import kode.kinopoisk.savin.letmemovie.navigator.ActivityNavigator;
import kode.kinopoisk.savin.letmemovie.util.DateUtil;

public class CinemaActivity extends BaseActivity {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.filmInfoSeancesList)
    RecyclerView mSeancesInfoRV;
    @Bind(R.id.cinemaName)
    TextView mCinemaNameText;
    @Bind(R.id.telText)
    TextView mTelephoneText;
    @Bind(R.id.siteText)
    TextView mSiteText;
    @Bind(R.id.ratingText)
    RatingBar ratingText;
    @Bind(R.id.fab)
    FloatingActionButton mFab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cinema);

        CinemaModel mCinemaModel = getIntent().getParcelableExtra(Constants.CINEMA_MODEL);

        initViewElements();

        if(mCinemaModel!=null)
        getCinemaInfo(Integer.parseInt(mCinemaModel.getCinemaID()));

    }

    private void initViewElements() {

        mToolbar.setTitle("Сеансы");

        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        mToolbar.showOverflowMenu();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mSeancesInfoRV.setLayoutManager(layoutManager);

        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityNavigator.startPhoneCallCinema(CinemaActivity.this,mTelephoneText.getText().toString());
            }
        });
    }


    private void getCinemaInfo(int cinemaID){
        DataService.init().getCinemaDetails(new DataService.onRequestCinemaDetail() {
            @Override
            public void onRequestCinemaDetail(CinemaDetailData cinemaDetail) {

                setCinemaViewElements(cinemaDetail);

            }
        }, DateUtil.getTodayDate(),cinemaID);
    }

    private void setCinemaViewElements(CinemaDetailData cinemaDetail) {
        mCinemaNameText.setText(cinemaDetail.getCinemaDetail().getCinemaName());
        mTelephoneText.setText(cinemaDetail.getCinemaDetail().getCinemaTelephone());
        mSiteText.setText(cinemaDetail.getCinemaDetail().getCinemaUrl());
        ratingText.setVisibility(View.VISIBLE);
        ratingText.setNumStars(5);
        if(cinemaDetail.getCinemaDetail().getRating()!=null)
        ratingText.setRating(Float.parseFloat(cinemaDetail.getCinemaDetail().getRating()));

        if(cinemaDetail.getCinemaDetail().getSeance()!=null) {
            SeanceItemRVAdapter adapter = new SeanceItemRVAdapter(CinemaActivity.this,
                    cinemaDetail.getCinemaDetail().getSeance().getItems());
            mSeancesInfoRV.setAdapter(adapter);
        }
    }

}
