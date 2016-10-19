package kode.kinopoisk.savin.letmemovie.fragment;


import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.VideoView;

import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.adapters.other.GalleryPhotoRVAdapter;
import kode.kinopoisk.savin.letmemovie.data.DataService;
import kode.kinopoisk.savin.letmemovie.data.models.filminfo.FilmInfoData;
import kode.kinopoisk.savin.letmemovie.util.BitmapBlur;
import kode.kinopoisk.savin.letmemovie.util.ImageUrlPatterMatcher;

/**
 * A simple {@link Fragment} subclass.
 */
public class FilmInfoFragment extends Fragment implements View.OnClickListener {

    @Bind(R.id.filmDescrText)
    TextView mFilmDescr;
    @Bind(R.id.trailerImage)
    VideoView mTrailerImage;
    @Bind(R.id.videoPlaceholder)
    ImageView mPlaceHolderVideo;
    @Bind(R.id.playTrailerButton)
    ImageView mTrailerPlayButton;
    @Bind(R.id.galleryRV)
    RecyclerView mGalleryView;
    @Bind(R.id.ratingBar)
    RatingBar mRatingBar;
    @Bind(R.id.imdb_rating_text)
    TextView imdbRatingText;
    @Bind(R.id.img_imdb)
    ImageView imageImdb;

    private FilmInfoData mFilmInfoData = new FilmInfoData();
    private static String filmID = "";

    public static FilmInfoFragment newInstance(Activity activity, String filmID) {

        FilmInfoFragment staffFragment = new FilmInfoFragment();
        FilmInfoFragment.filmID = filmID;

        return staffFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_film_info, container, false);
        ButterKnife.bind(this, view);

        initViewElements();

        getFilmInfo(filmID);

        return view;
    }

    private void initViewElements() {
        mTrailerPlayButton.setOnClickListener(this);

        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        mGalleryView.setLayoutManager(horizontalLayoutManagaer);
    }

    private void getFilmInfo(String filmID){
        DataService.init().getFilmInfo(new DataService.onRequestFilmInfoResult() {
            @Override
            public void onRequestFilmInfoResult(FilmInfoData filmInfoData) {

                Picasso.with(getActivity()).load(ImageUrlPatterMatcher.getImageUrl(getActivity(),filmInfoData.getPosterURL())).into(mPlaceHolderVideo);

                mPlaceHolderVideo.setImageBitmap(BitmapBlur.fastblur(((BitmapDrawable)mPlaceHolderVideo.getDrawable()).getBitmap(),0.2f,3));

                mFilmDescr.setText(filmInfoData.getDescription());
                mFilmInfoData = filmInfoData;
                GalleryPhotoRVAdapter galleryPhotoRVAdapter = new GalleryPhotoRVAdapter(getActivity(),filmInfoData.getGallery());
                mGalleryView.setAdapter(galleryPhotoRVAdapter);

                if(filmInfoData.getRatingData().getRating()!=null){
                    mRatingBar.setRating(Float.parseFloat(filmInfoData.getRatingData().getRating()));
                    if(filmInfoData.getRatingData().getRatingIMDb()!=null)
                    imdbRatingText.setText(filmInfoData.getRatingData().getRatingIMDb());
                    else imdbRatingText.setVisibility(View.GONE);}
                else {
                    mRatingBar.setVisibility(View.GONE);
                    imdbRatingText.setVisibility(View.GONE);
                    imageImdb.setVisibility(View.GONE);
                }

            }
        },filmID);
    }
    private void initTrailerVideo(FilmInfoData filmInfoData) {
        if(filmInfoData.getVideoURL()!=null){
            mTrailerImage.setVisibility(View.GONE);
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(filmInfoData.getVideoURL().getHd()));
            intent.setDataAndType(Uri.parse(filmInfoData.getVideoURL().getSd()), "video/mp4");
            startActivity(intent);}
   }


    // TODO In my opinion It's better to use playing trailer in player. Maybe its more user-friendly.
//    private void initTrailerVideo(FilmInfoData filmInfoData) {
//        try {
//            // Start the MediaController
//            MediaController mediacontroller = new MediaController(getActivity());
//            mediacontroller.setAnchorView(mTrailerImage);
//            // Get the URL from String VideoURL
//            Uri video = Uri.parse(filmInfoData.getVideoURL().getSd());
//            mTrailerImage.setMediaController(mediacontroller);
//            mTrailerImage.setVideoURI(video);
//
//        } catch (Exception e) {
//            Log.e("Error", e.getMessage());
//            e.printStackTrace();
//
//
//        mTrailerImage.requestFocus();
//        mTrailerImage.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//             // Close the progress bar and play the video
//             public void onPrepared(MediaPlayer mp) {
//                 mPlaceHolderVideo.setVisibility(View.GONE);
//                 mProgressBar.setVisibility(View.GONE);
//                 mTrailerImage.start();
//             }
//         });}
//    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.playTrailerButton:
                initTrailerVideo(mFilmInfoData);
                break;
        }
    }
}
