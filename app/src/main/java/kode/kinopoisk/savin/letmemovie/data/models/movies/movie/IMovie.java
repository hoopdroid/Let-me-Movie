package kode.kinopoisk.savin.letmemovie.data.models.movies.movie;

/**
 * Created by Илья on 15.10.2016.
 */

public interface IMovie {

    String getId();

    String getNameRU();

    String getPosterURL();

    String getGenre();

    String getFilmLength();

    VideoURL getVideoURL();

    String getRating();

    String getCountry();

    float getComparableRating();

}
