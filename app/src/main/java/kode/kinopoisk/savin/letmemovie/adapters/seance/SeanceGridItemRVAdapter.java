package kode.kinopoisk.savin.letmemovie.adapters.seance;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.data.models.seances.SeanceTime;

/**
 * An adapter for the list of MovieModels
 */
public class SeanceGridItemRVAdapter extends RecyclerView.Adapter<SeanceGridItemRVAdapter.ViewHolder> {

    private List<SeanceTime> seanceTimeList;
    private final Context context;
    private int lastPosition = -1;
    private boolean isMovieModelLikedByUser;
    private String userIdString;

    @Override
    public void onViewDetachedFromWindow(ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
    }

    public SeanceGridItemRVAdapter(Context context, List<SeanceTime> seanceTimeList) {
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

    private void addAnimationToPostItem(ViewHolder viewHolder, int i) {
        Animation animation = AnimationUtils.loadAnimation(context,
                (i > lastPosition) ? R.anim.up_from_bottom
                        : R.anim.down_to_top);
        viewHolder.itemView.startAnimation(animation);
        lastPosition = i;
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


        /**
         * Here is the key method to apply the animation
         */
        private void setAnimation(View viewToAnimate, int position) {
            // If the bound view wasn't previously displayed on screen, it's animated
            if (position > lastPosition) {
                Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
                viewToAnimate.startAnimation(animation);
                lastPosition = position;
            }
        }
    }
}
