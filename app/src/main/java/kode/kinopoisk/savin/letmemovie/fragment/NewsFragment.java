package kode.kinopoisk.savin.letmemovie.fragment;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.github.florent37.materialviewpager.header.MaterialViewPagerHeaderDecorator;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.adapters.news.NewsRVAdapter;
import kode.kinopoisk.savin.letmemovie.data.DataService;
import kode.kinopoisk.savin.letmemovie.data.models.movies.movie.TodayMovieModel;
import kode.kinopoisk.savin.letmemovie.data.models.news.NewsData;
import kode.kinopoisk.savin.letmemovie.data.models.news.NewsModel;

import static android.view.View.GONE;

/**
 * Created by Илья on 15.10.2016.
 */

public class NewsFragment extends Fragment {


    protected static Context mContext;

    @Bind(R.id.newsRV)
    RecyclerView mRecyclerView;

    public NewsFragment() {
    }

    public static NewsFragment newInstance(Activity activity) {

        NewsFragment fragment = new NewsFragment();
        mContext = activity;
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_news, container, false);

        ButterKnife.bind(this, view);

        getNews();

        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView.LayoutManager layoutManager;
            layoutManager = new LinearLayoutManager(getActivity());

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);

    }

    public void getNews(){
        DataService.init().getNews(new DataService.onRequestNewsData() {
            @Override
            public void onRequestNewsData(NewsData newsData) {
                mRecyclerView.addItemDecoration(new MaterialViewPagerHeaderDecorator());
                NewsRVAdapter newsRVAdapter = new NewsRVAdapter(getActivity(),newsData.getNewsData());
                mRecyclerView.setAdapter(newsRVAdapter);
            }
        });
    }


}
