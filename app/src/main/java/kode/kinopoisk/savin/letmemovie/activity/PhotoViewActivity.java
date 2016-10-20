package kode.kinopoisk.savin.letmemovie.activity;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.squareup.picasso.Picasso;

import butterknife.Bind;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.components.Constants;
import kode.kinopoisk.savin.letmemovie.util.ImageUrlPatterMatcher;
import uk.co.senab.photoview.PhotoView;

public class PhotoViewActivity extends BaseActivity {

    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.iv_photo)
    PhotoView mPhotoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_view);

        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
            mPhotoView.setTransitionName(Constants.PHOTO_IMAGE);
        }

        String photo = getIntent().getStringExtra(Constants.PHOTO_IMAGE);

        Picasso.with(this).load(ImageUrlPatterMatcher.getHDGalleryUrl(this,photo))
                .placeholder(R.drawable.placeholder_gallery).error(R.drawable.placeholder_gallery).into(mPhotoView);


    }



}
