package kode.kinopoisk.savin.letmemovie.data;

import kode.kinopoisk.savin.letmemovie.api.ApiManager;
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
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by ElaySavin on 14.10.2016.
 */

public class DataService {

    private static DataService dataService;

    public static DataService init() {
        if (dataService == null) {
            dataService = new DataService();
        }
        return dataService;
    }

    public void getCinemas(final onRequestCinemasResult listener,int userId) {

        ApiManager.getApiService().getCinemasFromCityId(userId, new Callback<CinemaData>() {
            @Override
            public void success(CinemaData cinemaData, Response response) {
                listener.onRequestCinemasResult(cinemaData);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    };

    public void getTodayMovies(final onRequestMoviesResult listener, int cityID, String date){
        ApiManager.getApiService().getTodayMovies(date, cityID, new Callback<TodayMovieData>() {
            @Override
            public void success(TodayMovieData todayMovieData, Response response) {
                listener.onRequestMoviesResult(todayMovieData);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    };

    public void getSoonMovies(final onRequestSoonMoviesResult listener, int cityID, String date){
        ApiManager.getApiService().getSoonMovies(date, cityID, new Callback<SoonMovieData>() {
            @Override
            public void success(SoonMovieData soonMovieData, Response response) {
                listener.onRequestSoonMoviesResult(soonMovieData);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    };


    public void getFilmInfo (final  onRequestFilmInfoResult listener,String filmID){
        ApiManager.getApiService().getFilm(filmID, new Callback<FilmInfoData>() {
            @Override
            public void success(FilmInfoData filmInfoData, Response response) {
                listener.onRequestFilmInfoResult(filmInfoData);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    };

    public void getStaffMovie(final onRequestStaffMovieResult listener,String movieID){
        ApiManager.getApiService().getMovieStaff(movieID, new Callback<StaffMovieData>() {
            @Override
            public void success(StaffMovieData staffMovieData, Response response) {
                listener.onRequestStaffMoveResult(staffMovieData);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    public void getMovieSeance(final onRequestSeanceResult listener,int cityId,int filmId,String date){
        ApiManager.getApiService().getMovieSeance(filmId, cityId, date, new Callback<MovieSeanceData>() {
            @Override
            public void success(MovieSeanceData movieSeanceData, Response response) {
                listener.onRequestSeanceResult(movieSeanceData);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    public void getCitiesList(final onRequestCitiesResult listener, int counryID){
        ApiManager.getApiService().getCities(counryID, new Callback<CitiesData>() {
            @Override
            public void success(CitiesData citiesData, Response response) {
                listener.onRequestCitiesResult(citiesData);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    public void getCinemaDetails(final onRequestCinemaDetail listener,String date,int cinemaID){
        ApiManager.getApiService().getCinemaDetail(cinemaID, date, new Callback<CinemaDetailData>() {
            @Override
            public void success(CinemaDetailData cinemaDetailData, Response response) {
                listener.onRequestCinemaDetail(cinemaDetailData);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    public void getNews(final onRequestNewsData listener){
        ApiManager.getApiService().getNews(new Callback<NewsData>() {
            @Override
            public void success(NewsData newsData, Response response) {
                listener.onRequestNewsData(newsData);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    public interface onRequestCinemasResult {
    public void onRequestCinemasResult(CinemaData cinemaDataList);
}
    public interface onRequestMoviesResult {
        public void onRequestMoviesResult(TodayMovieData todayMovieData);
    }
    public interface onRequestSoonMoviesResult {
        public void onRequestSoonMoviesResult(SoonMovieData movieData);
    }
    public interface onRequestStaffMovieResult{
        public void onRequestStaffMoveResult(StaffMovieData staffMovieData);
    }
    public interface onRequestFilmInfoResult{
        public void onRequestFilmInfoResult(FilmInfoData filmInfoData);
    }
    public interface onRequestSeanceResult{
        public void  onRequestSeanceResult(MovieSeanceData movieSeanceData);
    }
    public interface onRequestCitiesResult{
        public void onRequestCitiesResult(CitiesData citiesData);
    }
    public interface onRequestCinemaDetail{
        public void onRequestCinemaDetail(CinemaDetailData cinemaDetail);
    }
    public interface onRequestNewsData{
        public void onRequestNewsData(NewsData newsData);
    }

}






