package kode.kinopoisk.savin.letmemovie.util;

/**
 * Created by Илья on 19.10.2016.
 */

public class RatingUtil {

    public static float getRatingFromString(String rating){
        return Float.parseFloat(rating.substring(0,3));
    }

}
