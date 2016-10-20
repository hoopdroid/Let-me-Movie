package kode.kinopoisk.savin.letmemovie.navigator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.view.View;

import kode.kinopoisk.savin.letmemovie.activity.CinemaActivity;
import kode.kinopoisk.savin.letmemovie.activity.FirstStartActivity;
import kode.kinopoisk.savin.letmemovie.activity.MainActivity;
import kode.kinopoisk.savin.letmemovie.activity.MovieActivity;
import kode.kinopoisk.savin.letmemovie.activity.PhotoViewActivity;
import kode.kinopoisk.savin.letmemovie.components.Constants;

/**
 * Created by Илья on 15.10.2016.
 */

public class ActivityNavigator {
    public static void startMovieActivity(Activity context, Parcelable parcelable, View imageView,int cityID) {

        Intent intent = new Intent(context, MovieActivity.class);

        intent.putExtra(Constants.MOVIE_EXTRA, parcelable);
        intent.putExtra("cityID",cityID);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
            imageView.setTransitionName(Constants.IMAGE_TRANSITION);
            Pair<View, String> pair1 = Pair.create(imageView, imageView.getTransitionName());
            ActivityOptionsCompat options = ActivityOptionsCompat.
                    makeSceneTransitionAnimation(context, pair1);
            context.startActivity(intent, options.toBundle());
        } else
            context.startActivity(intent);
    }

    public static void startCinemaActivity(Activity context, Parcelable parcelable) {

        Intent intent = new Intent(context, CinemaActivity.class);
        intent.putExtra("cinemamodel",parcelable);
        context.startActivity(intent);
    }

    public static void startMapsActivity(Activity context,String label, String latitude,String longitude) {

        String uriBegin = "geo:" + latitude + "," + longitude;
        String query = latitude + "," + longitude + "(" + label + ")";
        String encodedQuery = Uri.encode(query);
        String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
        Uri uri = Uri.parse(uriString);
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, uri);
        context.startActivity(intent);
    }

    public static void startPhotoActivity(Context activity,String photoUrl,View imageView){
        Intent intent = new Intent(activity, PhotoViewActivity.class);

        intent.putExtra(Constants.PHOTO_IMAGE,photoUrl);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            imageView.setTransitionName(Constants.PHOTO_IMAGE);
            Pair<View, String> pair1 = Pair.create(imageView, imageView.getTransitionName());
            ActivityOptionsCompat options = ActivityOptionsCompat.
                    makeSceneTransitionAnimation((Activity)activity, pair1);
            activity.startActivity(intent, options.toBundle());
        } else
            activity.startActivity(intent);
    }

    public static void startPhoneCallCinema(Context contet,String number){
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + number));
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        contet.startActivity(i);
    }

    public static void startSelectyCityActivity(Context context){
        Intent i = new Intent(context, FirstStartActivity.class);
        context.startActivity(i);
    }
    public static void startMainActivity(Context context){
        Intent i = new Intent(context, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
        context.startActivity(i);
    }

}
