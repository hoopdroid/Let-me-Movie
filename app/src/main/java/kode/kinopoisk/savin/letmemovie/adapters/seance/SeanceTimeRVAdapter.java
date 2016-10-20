package kode.kinopoisk.savin.letmemovie.adapters.seance;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.data.models.seances.SeanceTime;

/**
 * An adapter for the list
 */
public class SeanceTimeRVAdapter extends RecyclerView.Adapter<SeanceTimeRVAdapter.ViewHolder> {

    private List<SeanceTime> seanceTimeList;
    private final Context context;

    @Override
    public void onViewDetachedFromWindow(ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
    }

    public SeanceTimeRVAdapter(Context context, List<SeanceTime> seanceTimeList) {
        this.context = context;
        this.seanceTimeList = seanceTimeList;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_seance_time, viewGroup, false);


        return new ViewHolder(view, viewGroup.getContext());
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {

        viewHolder.dateText.setText(seanceTimeList.get(i).getTime());

    }

    @Override
    public int getItemCount() {
        return seanceTimeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @Bind(R.id.movie_container)
        CardView cardView;
        @Bind(R.id.dateText)
        TextView dateText;

        protected Context context;

        public ViewHolder(View view, final Context context) {
            super(view);

            ButterKnife.bind(this, view);

            this.context = context;

        }


        @Override
        public void onClick(View v) {

        }

    }
}
