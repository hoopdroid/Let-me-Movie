package kode.kinopoisk.savin.letmemovie.adapters.movie;


import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.regex.Pattern;

import butterknife.Bind;
import butterknife.ButterKnife;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.data.models.movies.movie.TodayMovieModel;
import kode.kinopoisk.savin.letmemovie.navigator.ActivityNavigator;
import kode.kinopoisk.savin.letmemovie.util.ImageUrlPatterMatcher;

/**
 * An adapter for the list of MovieModels
 */
public class MoviesRVAdapter extends RecyclerView.Adapter<MoviesRVAdapter.ViewHolder> {

    private List<TodayMovieModel> todayMovieModelsList;
    private final Context context;
    private int lastPosition = -1;
    private boolean isMovieModelLikedByUser;
    private String userIdString;

    private int cityID;

    @Override
    public void onViewDetachedFromWindow(ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
    }

    public MoviesRVAdapter(Context context, List<TodayMovieModel> todayMovieModelsList,int townID) {
        this.context = context;
        this.todayMovieModelsList = todayMovieModelsList;
        this.cityID = townID;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_movie, viewGroup, false);

        return new ViewHolder(view, viewGroup.getContext());
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {


        viewHolder.movieText.setText(todayMovieModelsList.get(i).getNameRU());

        if (todayMovieModelsList.get(i).getRating()!=null&&!todayMovieModelsList.get(i).equals(""))
        viewHolder.ratingText.setText(todayMovieModelsList.get(i).getRating().substring(0,3));

        Picasso.with(context).load(ImageUrlPatterMatcher.getImageUrl((Activity)context, todayMovieModelsList.get(i).getPosterURL()))
                .into(viewHolder.movieImage);


        int a = 5;

      //  addAnimationToPostItem(viewHolder,i);



    }

    private void addAnimationToPostItem(ViewHolder viewHolder, int i) {
        Animation animation = AnimationUtils.loadAnimation(context,
                (i > lastPosition) ? R.anim.up_from_bottom
                        : R.anim.down_to_top);
        viewHolder.itemView.startAnimation(animation);
        lastPosition = i;
    }



    private void addClickableLinkToText(ViewHolder viewHolder) {
        viewHolder.movieText.setLinksClickable(true);
        Pattern httpPattern = Pattern.compile("[a-z]+:\\/\\/[^ \\n]*");
        Linkify.addLinks(viewHolder.movieText, httpPattern,"");
    }



    @Override
    public int getItemCount() {
        return todayMovieModelsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @Bind(R.id.movie_container)
        CardView cardView;
        @Bind(R.id.tv_name)
        TextView movieText;
        @Bind(R.id.img_movie)
        ImageView movieImage;
        @Bind(R.id.ratingText)
        TextView ratingText;


        protected Context context;

        public ViewHolder(View view, final Context context) {
            super(view);
            this.context=context;
            ButterKnife.bind(this, view);
            movieImage.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            if(v==movieImage)

                ActivityNavigator.startMovieActivity((Activity)context, todayMovieModelsList.get(getPosition()),movieImage,cityID);

            }
        }


    /**
     * Here is the key method to apply the animation
     */
    private void setAnimation(View viewToAnimate, int position)
    {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }
}