
package kode.kinopoisk.savin.letmemovie.data.models.movies.movie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class TodayMovieData {

    @SerializedName("filmsData")
    @Expose
    private List<TodayMovieModel> filmsData = new ArrayList<TodayMovieModel>();
    @SerializedName("date")
    @Expose
    private String date;

    /**
     * 
     * @return
     *     The filmsData
     */
    public List<TodayMovieModel> getFilmsData() {
        return filmsData;
    }

    /**
     * 
     * @param filmsData
     *     The filmsData
     */
    public void setFilmsData(List<TodayMovieModel> filmsData) {
        this.filmsData = filmsData;
    }

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }




}
