package kode.kinopoisk.savin.letmemovie.adapters.movie;


import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.data.models.movies.movie.SoonMovieModel;
import kode.kinopoisk.savin.letmemovie.navigator.ActivityNavigator;
import kode.kinopoisk.savin.letmemovie.util.ImageUrlPatterMatcher;

/**
 * An adapter for the list of PreviewFilms
 */
public class SoonMoviesRVAdapter extends RecyclerView.Adapter<SoonMoviesRVAdapter.ViewHolder> {

    private List<SoonMovieModel> previewFilmsList;
    private final Context context;
    private int cityID;

    @Override
    public void onViewDetachedFromWindow(ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
    }

    public SoonMoviesRVAdapter(Context context, List<SoonMovieModel> previewFilmsList,int townID) {
        this.context = context;
        this.previewFilmsList = previewFilmsList;
        this.cityID = townID;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_soon_movie, viewGroup, false);

        return new ViewHolder(view, viewGroup.getContext());
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {


        viewHolder.movieText.setText(previewFilmsList.get(i).getNameRU());

        if (previewFilmsList.get(i).getRating()!=null&&!previewFilmsList.get(i).getRating().equals(""))
        viewHolder.ratingText.setText(previewFilmsList.get(i).getRating().substring(0,3));

        viewHolder.dateText.setText(previewFilmsList.get(i).getPremiereRU());

        Picasso.with(context).load(ImageUrlPatterMatcher.getImageUrl((Activity)context, previewFilmsList.get(i).getPosterURL())).error(R.color.primary_light)
                .into(viewHolder.movieImage);

    }


    @Override
    public int getItemCount() {
        return previewFilmsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @Bind(R.id.movie_container)
        CardView cardView;
        @Bind(R.id.tv_soon_name)
        TextView movieText;
        @Bind(R.id.img_soon_movie)
        ImageView movieImage;
        @Bind(R.id.ratingSoonText)
        TextView ratingText;
        @Bind(R.id.dateSoonText)
        TextView dateText;


        protected Context context;

        public ViewHolder(View view, final Context context) {
            super(view);

            ButterKnife.bind(this, view);
            movieImage.setOnClickListener(this);

            this.context=context;

        }



        @Override
        public void onClick(View v) {

            if(v== movieImage){

                ActivityNavigator.startMovieActivity((Activity)context, previewFilmsList.get(getPosition()),movieImage,cityID);

            }
        }

    }
}