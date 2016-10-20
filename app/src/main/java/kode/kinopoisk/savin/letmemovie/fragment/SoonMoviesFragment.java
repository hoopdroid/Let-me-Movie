package kode.kinopoisk.savin.letmemovie.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.github.florent37.materialviewpager.header.MaterialViewPagerHeaderDecorator;

import java.util.ArrayList;
import java.util.List;

import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.adapters.movie.SoonMoviesRVAdapter;
import kode.kinopoisk.savin.letmemovie.data.DataService;
import kode.kinopoisk.savin.letmemovie.data.models.movies.movie.SoonMovieData;
import kode.kinopoisk.savin.letmemovie.data.models.movies.movie.SoonMovieModel;


/**
 * Created by Elay Savin.
 */
public class SoonMoviesFragment extends AbstractMoviesFragment {


    protected static String mSoonDate;

    public static SoonMoviesFragment newInstance(Activity activity,String date,String cityID) {

        SoonMoviesFragment fragment = new SoonMoviesFragment();
        mContext = activity;
        mSoonDate = date;
        mCityID = cityID;
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSoonMoviesList();
    }

    private void getSoonMoviesList() {
        DataService.init().getSoonMovies(new DataService.onRequestSoonMoviesResult() {
            @Override
            public void onRequestSoonMoviesResult(SoonMovieData movieData) {
                hideFab();
                mProgressBar.setVisibility(View.GONE);
                mRecyclerView.addItemDecoration(new MaterialViewPagerHeaderDecorator());
                List<SoonMovieModel> list = new ArrayList<SoonMovieModel>();
                for (int i = 0; i < movieData.getPreviewFilms().size() ; i++) {
                    list.addAll(movieData.getPreviewFilms().get(i));
                }
                mAdapter = new SoonMoviesRVAdapter(mContext,list,Integer.parseInt(mCityID));
                mRecyclerView.setAdapter(mAdapter);
            }
        }, Integer.parseInt(mCityID), mSoonDate);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }}
}
