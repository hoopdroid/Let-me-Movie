package kode.kinopoisk.savin.letmemovie.fragment;


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

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.data.models.movies.movie.TodayMovieModel;

/**
 * Created by Илья on 15.10.2016.
 */

public abstract class AbstractMoviesFragment extends Fragment implements View.OnClickListener {

    protected static final boolean GRID_LAYOUT = false;
    protected RecyclerView.Adapter mAdapter;
    protected List<TodayMovieModel> mContentItems = new ArrayList<>();
    protected static Context mContext;
    protected static String mDate;
    protected static String mCityID;

    @Bind(R.id.recyclerView)
    RecyclerView mRecyclerView;
    @Bind(R.id.progressBar)
    ProgressBar mProgressBar;
    @Bind(R.id.menu_item1)
    FloatingActionButton fab1;
    @Bind(R.id.menu_item2)
    FloatingActionButton fab2;
    @Bind(R.id.menu)
    FloatingActionMenu floatingActionMenu;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments()!=null)
            mContentItems = getArguments().getParcelableArrayList("movies");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        ButterKnife.bind(this, view);

        fab1.setOnClickListener(this);
        fab2.setOnClickListener(this);

        hideFab();


        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView.LayoutManager layoutManager;

        if (GRID_LAYOUT) {
            layoutManager = new GridLayoutManager(getActivity(), 2);
        } else {
            layoutManager = new LinearLayoutManager(getActivity());
        }
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);

    }

    protected void hideFab(){
        floatingActionMenu.hideMenu(true);
    }

    protected void showFab(){
        floatingActionMenu.showMenu(true);
    }



}
