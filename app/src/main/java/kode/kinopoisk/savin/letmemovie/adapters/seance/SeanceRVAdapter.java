package kode.kinopoisk.savin.letmemovie.adapters.seance;


import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.components.CustomLayoutManager;
import kode.kinopoisk.savin.letmemovie.data.models.seances.SeanceModel;
import kode.kinopoisk.savin.letmemovie.navigator.ActivityNavigator;

/**
 *An adapter for the list
 */
public class SeanceRVAdapter extends RecyclerView.Adapter<SeanceRVAdapter.ViewHolder> {

    private List<SeanceModel> seanceMovieList;
    private final Context context;

    @Override
    public void onViewDetachedFromWindow(ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
    }

    public SeanceRVAdapter(Context context, List<SeanceModel> seanceMovieList) {
        this.context = context;
        this.seanceMovieList = seanceMovieList;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_seance, viewGroup, false);



        return new ViewHolder(view, viewGroup.getContext());
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {

        viewHolder.cinemaName.setText(seanceMovieList.get(i).getCinemaName());
        viewHolder.dateText.setText(seanceMovieList.get(i).getAddress());

        RecyclerView.LayoutManager gridManager = new CustomLayoutManager(context, LinearLayoutManager.HORIZONTAL,false);
        viewHolder.mSeanceGrid.setLayoutManager(gridManager);

        SeanceTimeRVAdapter seanceTimeRVAdapter = new SeanceTimeRVAdapter(context,seanceMovieList.get(i).getSeanceTime());
        viewHolder.mSeanceGrid.setAdapter(seanceTimeRVAdapter);



    }

    @Override
    public int getItemCount() {
        return seanceMovieList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @Bind(R.id.movie_container)
        CardView cardView;
        @Bind(R.id.tv_cinema_name)
        TextView cinemaName;
        @Bind(R.id.dateText)
        TextView dateText;
        @Bind(R.id.seanceGridRV)
        RecyclerView mSeanceGrid;
        @Bind(R.id.btnCinemaOnMap)
        Button mBtnCinemaMap;

        protected Context context;

        public ViewHolder(View view, final Context context) {
            super(view);

            ButterKnife.bind(this, view);

            this.context=context;

            mBtnCinemaMap.setOnClickListener(this);
        }



        @Override
        public void onClick(View v) {

            if(v==mBtnCinemaMap){}

                ActivityNavigator.startMapsActivity((Activity)context,seanceMovieList.get(getPosition()).getCinemaName(),
                        seanceMovieList.get(getPosition()).getLat(),
                        seanceMovieList.get(getPosition()).getLon());

            }
        }

}