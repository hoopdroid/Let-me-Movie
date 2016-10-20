
package kode.kinopoisk.savin.letmemovie.data.models.movies.movie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class SoonMovieData {

    @SerializedName("previewFilms")
    @Expose
    private List<List<SoonMovieModel>> previewFilms = new ArrayList<List<SoonMovieModel>>();
    @SerializedName("date")
    @Expose
    private String date;

    /**
     * 
     * @return
     *     The previewFilms
     */
    public List<List<SoonMovieModel>> getPreviewFilms() {
        return previewFilms;
    }

    /**
     * 
     * @param previewFilms
     *     The previewFilms
     */
    public void setPreviewFilms(List<List<SoonMovieModel>> previewFilms) {
        this.previewFilms = previewFilms;
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
