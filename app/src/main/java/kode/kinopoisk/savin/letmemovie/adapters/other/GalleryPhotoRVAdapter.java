package kode.kinopoisk.savin.letmemovie.adapters.other;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.data.models.filminfo.Gallery;
import kode.kinopoisk.savin.letmemovie.navigator.ActivityNavigator;
import kode.kinopoisk.savin.letmemovie.util.ImageUrlPatterMatcher;

/**
 * An adapter for the list of GalleryPhoto
 */
public class GalleryPhotoRVAdapter extends RecyclerView.Adapter<GalleryPhotoRVAdapter.ViewHolder> {

    private List<Gallery> galleryModelList;
    private final Context context;

    @Override
    public void onViewDetachedFromWindow(ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
    }

    public GalleryPhotoRVAdapter(Context context, List<Gallery> galleryModelList) {
        this.context = context;
        this.galleryModelList = galleryModelList;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_gallery, viewGroup, false);

        return new ViewHolder(view, viewGroup.getContext());
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {


        Picasso.with(context).load(ImageUrlPatterMatcher.getGalleryUrl(context,galleryModelList.get(i).getPreview()))
                .placeholder(R.drawable.placeholder_gallery).
                into(viewHolder.galleryImage);


    }


    @Override
    public int getItemCount() {
        return galleryModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        @Bind(R.id.img_gallery)
        ImageView galleryImage;

        protected Context context;

        public ViewHolder(View view, final Context context) {
            super(view);

            galleryImage = (CircularImageView)view.findViewById(R.id.img_staff_face);
            ButterKnife.bind(this, view);
            galleryImage.setOnClickListener(this);

            this.context=context;

        }



        @Override
        public void onClick(View v) {

            if(v== galleryImage)
            {

            }
            ActivityNavigator.startPhotoActivity(context,galleryModelList.get(getPosition()).getPreview(),galleryImage);

            }
        }

}