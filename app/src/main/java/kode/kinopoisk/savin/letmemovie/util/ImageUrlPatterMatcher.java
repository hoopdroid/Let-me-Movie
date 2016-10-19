package kode.kinopoisk.savin.letmemovie.util;

import android.content.Context;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import kode.kinopoisk.savin.letmemovie.R;

/**
 * Created by Илья on 15.10.2016.
 */

public class ImageUrlPatterMatcher {

    public static String getImageUrl(Context context, String oldUrl) {

        if (oldUrl!=null) {
            String newUrl = "film_iphone/iphone_922302.jpg?d=20160829161708";
            StringBuilder stringBuilder = new StringBuilder();
            Pattern regex = Pattern.compile("[^_.]+(?=\\.[^.]+$)");
            Matcher matcher = regex.matcher(oldUrl);
            if (matcher.find()) {
                String s = matcher.group();

                stringBuilder.append(context.getResources().getString(R.string.kinopoisk_image_url));
                stringBuilder.append(s);
                stringBuilder.append(".jpg");

                return stringBuilder.toString();
            }

            return newUrl;
        }
            else return "fail url";
    }

    public static String getActorUrl(Context context, String oldUrl) {

        if (oldUrl!=null) {
            String newUrl = "film_iphone/iphone_922302.jpg?d=20160829161708";
            StringBuilder stringBuilder = new StringBuilder();
            Pattern regex = Pattern.compile("[^_.]+(?=\\.[^.]+$)");
            Matcher matcher = regex.matcher(oldUrl);
            if (matcher.find()) {
                String s = matcher.group();

                stringBuilder.append(context.getResources().getString(R.string.kinopoisk_actor_url));
                stringBuilder.append(s);
                stringBuilder.append(".jpg");

                return stringBuilder.toString();
            }

            return newUrl;
        }
        else return "fail url";
    }

    public static String getGalleryUrl(Context context, String oldUrl) {

        if (oldUrl!=null) {
            String newUrl = "film_iphone/iphone_922302.jpg?d=20160829161708";
            StringBuilder stringBuilder = new StringBuilder();


                stringBuilder.append(context.getResources().getString(R.string.kinopoisk_gallery_url));
                stringBuilder.append(oldUrl);

                return stringBuilder.toString();
            }

        else return "fail url";
    }

    public static String getNewsImageUrl(Context context, String oldUrl) {

        if (oldUrl!=null) {
            String newUrl = "https://st.kp.yandex.net/images/news/mid_2822517_1476107780.jpg";
            StringBuilder stringBuilder = new StringBuilder();

            stringBuilder.append(context.getResources().getString(R.string.kinopoisk_news_image_url));
            stringBuilder.append(oldUrl);

            return stringBuilder.toString();
        }

        else return "fail url";
    }

    public static String getHDGalleryUrl(Context context, String oldUrl) {

        if (oldUrl!=null) {
            String newUrl = "film_iphone/iphone_922302.jpg?d=20160829161708";
            StringBuilder stringBuilder = new StringBuilder();
            Pattern regex = Pattern.compile("[^_.]+(?=\\.[^.]+$)");
            Matcher matcher = regex.matcher(oldUrl);
            if (matcher.find()) {
                String s = matcher.group();

                stringBuilder.append(context.getResources().getString(R.string.kinopoisk_gallery_hd_url));
                stringBuilder.append(s);
                stringBuilder.append(".jpg");


                return stringBuilder.toString();
            }

            return newUrl;
        }
        else return "fail url";
    }



}
