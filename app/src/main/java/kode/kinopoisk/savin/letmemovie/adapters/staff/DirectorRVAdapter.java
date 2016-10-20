package kode.kinopoisk.savin.letmemovie.adapters.staff;


import android.app.Activity;
import android.content.Context;
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
import kode.kinopoisk.savin.letmemovie.data.models.staff.StaffMovieModel;
import kode.kinopoisk.savin.letmemovie.util.ImageUrlPatterMatcher;

/**
 * An adapter for the list of StaffMovieModel for Director of Movie
 */
public class DirectorRVAdapter extends RecyclerView.Adapter<DirectorRVAdapter.ViewHolder> {

    private List<StaffMovieModel> staffModelList;
    private final Context context;

    @Override
    public void onViewDetachedFromWindow(ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
    }

    public DirectorRVAdapter(Context context, List<StaffMovieModel> staffModelList) {
        this.context = context;
        this.staffModelList = staffModelList;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_director, viewGroup, false);

        return new ViewHolder(view, viewGroup.getContext());
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {


        viewHolder.movieText.setText(staffModelList.get(i).getNameRU());

        Picasso.with(context).load(ImageUrlPatterMatcher.getActorUrl((Activity)context, staffModelList.get(i).getPosterURL()))
        .placeholder(R.drawable.ic_account_circle_blue_grey_200_24dp).
                into(viewHolder.movieImage);


    }


    @Override
    public int getItemCount() {
        return staffModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @Bind(R.id.tv_staff_name)
        TextView movieText;

        ImageView movieImage;


        protected Context context;

        public ViewHolder(View view, final Context context) {
            super(view);

            movieImage = (ImageView)view.findViewById(R.id.img_staff_face);
            ButterKnife.bind(this, view);
            movieImage.setOnClickListener(this);

            this.context=context;

        }



        @Override
        public void onClick(View v) {

            if(v==movieImage)
            {

            }


            }
        }

}