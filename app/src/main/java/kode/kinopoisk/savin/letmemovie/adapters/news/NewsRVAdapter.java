package kode.kinopoisk.savin.letmemovie.adapters.news;


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
import kode.kinopoisk.savin.letmemovie.data.models.news.NewsModel;
import kode.kinopoisk.savin.letmemovie.util.ImageUrlPatterMatcher;

/**
 * An adapter for the list of NewsModel
 */
public class NewsRVAdapter extends RecyclerView.Adapter<NewsRVAdapter.ViewHolder> {

    private List<NewsModel> newsList;
    private final Context context;

    @Override
    public void onViewDetachedFromWindow(ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
    }

    public NewsRVAdapter(Context context, List<NewsModel> newsList) {
        this.context = context;
        this.newsList = newsList;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_news, viewGroup, false);

        return new ViewHolder(view, viewGroup.getContext());
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {

        viewHolder.movieText.setText(newsList.get(i).getNewsDescription());
        Picasso.with(context).load(ImageUrlPatterMatcher.getNewsImageUrl((Activity)context, newsList.get(i).getNewsImagePreviewURL()))
                .into(viewHolder.movieImage);

    }


    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @Bind(R.id.news_container)
        CardView cardView;
        @Bind(R.id.tv_name)
        TextView movieText;
        @Bind(R.id.img_movie)
        ImageView movieImage;

        protected Context context;

        public ViewHolder(View view, final Context context) {
            super(view);
            this.context=context;
            ButterKnife.bind(this, view);
            movieImage.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }

    }
}