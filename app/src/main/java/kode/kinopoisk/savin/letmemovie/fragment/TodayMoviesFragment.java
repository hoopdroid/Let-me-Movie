package kode.kinopoisk.savin.letmemovie.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.github.florent37.materialviewpager.header.MaterialViewPagerHeaderDecorator;

import java.util.Collections;

import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.adapters.movie.MoviesRVAdapter;
import kode.kinopoisk.savin.letmemovie.components.CustomTopComparator;
import kode.kinopoisk.savin.letmemovie.components.CustomLowComparator;
import kode.kinopoisk.savin.letmemovie.data.DataService;
import kode.kinopoisk.savin.letmemovie.data.models.movies.movie.TodayMovieData;

/**
 * Created by Elay Savin
 */
public class TodayMoviesFragment extends AbstractMoviesFragment {


    public static TodayMoviesFragment newInstance(Activity activity,String date,String cityID) {

        TodayMoviesFragment fragment = new TodayMoviesFragment();
        mContext = activity;
        mDate = date;
        mCityID = cityID;
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getTodayMoviesList();
    }

    private void getTodayMoviesList() {
        DataService.init().getTodayMovies(new DataService.onRequestMoviesResult() {
            @Override
            public void onRequestMoviesResult(TodayMovieData todayMovieData) {
                showFab();
                mProgressBar.setVisibility(View.GONE);
                mContentItems = todayMovieData.getFilmsData();
                mRecyclerView.addItemDecoration(new MaterialViewPagerHeaderDecorator());
                mAdapter = new MoviesRVAdapter(mContext, mContentItems,Integer.parseInt(mCityID));
                mRecyclerView.setAdapter(mAdapter);


            }
        },Integer.parseInt(mCityID),mDate);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu_item1:
                Toast.makeText(getActivity(), "Сортировка по убыванию рейтинга", Toast.LENGTH_SHORT).show();
                Collections.sort(mContentItems,new CustomTopComparator());
                floatingActionMenu.close(true);
                mAdapter.notifyDataSetChanged();
                break;
            case R.id.menu_item2:
                Toast.makeText(getActivity(), "Сортировка по возрастанию рейтинга", Toast.LENGTH_SHORT).show();
                Collections.sort(mContentItems,new CustomLowComparator());
                floatingActionMenu.close(true);
                mAdapter.notifyDataSetChanged();
                break;
    }}
}
