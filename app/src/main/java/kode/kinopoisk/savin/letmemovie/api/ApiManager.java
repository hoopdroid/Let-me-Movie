package kode.kinopoisk.savin.letmemovie.api;

import kode.kinopoisk.savin.letmemovie.data.models.cinemaInfo.CinemaDetailData;
import kode.kinopoisk.savin.letmemovie.data.models.cinemas.CinemaData;
import kode.kinopoisk.savin.letmemovie.data.models.city.CitiesData;
import kode.kinopoisk.savin.letmemovie.data.models.filminfo.FilmInfoData;
import kode.kinopoisk.savin.letmemovie.data.models.movies.movie.SoonMovieData;
import kode.kinopoisk.savin.letmemovie.data.models.movies.movie.TodayMovieData;
import kode.kinopoisk.savin.letmemovie.data.models.news.NewsData;
import kode.kinopoisk.savin.letmemovie.data.models.seances.MovieSeanceData;
import kode.kinopoisk.savin.letmemovie.data.models.staff.StaffMovieData;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by ElaySavin on 14.10.2016.
 */

public class ApiManager {

    private static ApiService apiService;
    private static final String URL = "http://api.kinopoisk.cf";


    public interface ApiService {

        @GET("/getCityList")
        void getCities (@Query("countryID") int countryID,
                                   Callback<CitiesData> cinemasList);

        @GET("/getCinemas")
        void getCinemasFromCityId (@Query("cityID") int cityId,
                                   Callback<CinemaData> cinemasList);

        @GET("/getTodayFilms")
        void getTodayMovies (@Query("date") String date,
                @Query("cityID") int cityId,
                                   Callback<TodayMovieData> movieTodayData);

        @GET("/getSoonFilms")
        void getSoonMovies (@Query("date") String date,
                             @Query("cityID") int cityId,
                             Callback<SoonMovieData> movieSoonData);
        @GET("/getStaff")
        void getMovieStaff (@Query("filmID") String filmID,
                            Callback<StaffMovieData> staffData);
        @GET("/getFilm")
        void getFilm (@Query("filmID") String filmID,
                      Callback<FilmInfoData> filmData);
        @GET("/getSeance")
        void getMovieSeance (@Query("filmID") int filmId,
                            @Query("cityID") int cityId,
                            @Query("date") String date,
                            Callback<MovieSeanceData> seancesData);

        @GET("/getCinemaDetail")
        void getCinemaDetail(@Query("cinemaID") int cinemaID,
                             @Query("date") String date,
                            Callback<CinemaDetailData> cinemaDetailData);
        @GET("/getNews")
        void getNews(Callback<NewsData> newsData);

    }

    public static ApiService getApiService () {

        RestAdapter restAdapter = new RestAdapter.Builder().
                setEndpoint(URL).build();

        apiService = restAdapter.create(ApiService.class);

        return apiService;

    }

}