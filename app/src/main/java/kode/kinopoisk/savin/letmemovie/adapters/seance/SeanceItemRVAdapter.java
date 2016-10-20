package kode.kinopoisk.savin.letmemovie.adapters.seance;


import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.components.CustomLayoutManager;
import kode.kinopoisk.savin.letmemovie.data.models.cinemaInfo.Item;

/**
 * An adapter for the list
 */
public class SeanceItemRVAdapter extends RecyclerView.Adapter<SeanceItemRVAdapter.ViewHolder> {

    private List<Item> seanceMovieList;
    private final Context context;
    private int lastPosition = -1;

    @Override
    public void onViewDetachedFromWindow(ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
    }

    public SeanceItemRVAdapter(Context context, List<Item> seanceMovieList) {
        this.context = context;
        this.seanceMovieList = seanceMovieList;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_seance_cinema, viewGroup, false);



        return new ViewHolder(view, viewGroup.getContext());
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {

        viewHolder.cinemaName.setText(seanceMovieList.get(i).getNameRU());

        RecyclerView.LayoutManager gridManager = new CustomLayoutManager(context, LinearLayoutManager.HORIZONTAL,false);
        viewHolder.mSeanceGrid.setLayoutManager(gridManager);

        SeanceMovieItemRVAdapter seanceGridItemRVAdapter = new SeanceMovieItemRVAdapter(context,seanceMovieList.get(i).getSeance());
        viewHolder.mSeanceGrid.setAdapter(seanceGridItemRVAdapter);

    }

    @Override
    public int getItemCount() {
        return seanceMovieList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @Bind(R.id.tv_cinema_name)
        TextView cinemaName;
        @Bind(R.id.seanceGridRV)
        RecyclerView mSeanceGrid;

        protected Context context;

        public ViewHolder(View view, final Context context) {
            super(view);

            ButterKnife.bind(this, view);
            this.context=context;

        }

        @Override
        public void onClick(View v) {


            }
        }

}