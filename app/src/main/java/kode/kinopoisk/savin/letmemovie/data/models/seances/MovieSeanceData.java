
package kode.kinopoisk.savin.letmemovie.data.models.seances;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import kode.kinopoisk.savin.letmemovie.data.models.movies.movie.VideoURL;


public class MovieSeanceData {

    @SerializedName("cityID")
    @Expose
    private String cityID;
    @SerializedName("cityName")
    @Expose
    private String cityName;
    @SerializedName("seanceURL")
    @Expose
    private String seanceURL;
    @SerializedName("filmID")
    @Expose
    private String filmID;
    @SerializedName("nameRU")
    @Expose
    private String nameRU;
    @SerializedName("nameEN")
    @Expose
    private String nameEN;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("posterURL")
    @Expose
    private String posterURL;
    @SerializedName("filmLength")
    @Expose
    private String filmLength;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("videoURL")
    @Expose
    private VideoURL videoURL;
    @SerializedName("items")
    @Expose
    private List<SeanceModel> seanceModels = new ArrayList<SeanceModel>();
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("imdbID")
    @Expose
    private String imdbID;

    /**
     * 
     * @return
     *     The cityID
     */
    public String getCityID() {
        return cityID;
    }

    /**
     * 
     * @param cityID
     *     The cityID
     */
    public void setCityID(String cityID) {
        this.cityID = cityID;
    }

    /**
     * 
     * @return
     *     The cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 
     * @param cityName
     *     The cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 
     * @return
     *     The seanceURL
     */
    public String getSeanceURL() {
        return seanceURL;
    }

    /**
     * 
     * @param seanceURL
     *     The seanceURL
     */
    public void setSeanceURL(String seanceURL) {
        this.seanceURL = seanceURL;
    }

    /**
     * 
     * @return
     *     The filmID
     */
    public String getFilmID() {
        return filmID;
    }

    /**
     * 
     * @param filmID
     *     The filmID
     */
    public void setFilmID(String filmID) {
        this.filmID = filmID;
    }

    /**
     * 
     * @return
     *     The nameRU
     */
    public String getNameRU() {
        return nameRU;
    }

    /**
     * 
     * @param nameRU
     *     The nameRU
     */
    public void setNameRU(String nameRU) {
        this.nameRU = nameRU;
    }

    /**
     * 
     * @return
     *     The nameEN
     */
    public String getNameEN() {
        return nameEN;
    }

    /**
     * 
     * @param nameEN
     *     The nameEN
     */
    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    /**
     * 
     * @return
     *     The year
     */
    public String getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 
     * @return
     *     The rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The posterURL
     */
    public String getPosterURL() {
        return posterURL;
    }

    /**
     * 
     * @param posterURL
     *     The posterURL
     */
    public void setPosterURL(String posterURL) {
        this.posterURL = posterURL;
    }

    /**
     * 
     * @return
     *     The filmLength
     */
    public String getFilmLength() {
        return filmLength;
    }

    /**
     * 
     * @param filmLength
     *     The filmLength
     */
    public void setFilmLength(String filmLength) {
        this.filmLength = filmLength;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * 
     * @param genre
     *     The genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * 
     * @return
     *     The videoURL
     */
    public VideoURL getVideoURL() {
        return videoURL;
    }

    /**
     * 
     * @param videoURL
     *     The videoURL
     */
    public void setVideoURL(VideoURL videoURL) {
        this.videoURL = videoURL;
    }

    /**
     * 
     * @return
     *     The items
     */
    public List<SeanceModel> getSeanceModels() {
        return seanceModels;
    }

    /**
     * 
     * @param seanceModels
     *     The items
     */
    public void setSeanceModels(List<SeanceModel> seanceModels) {
        this.seanceModels = seanceModels;
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

    /**
     * 
     * @return
     *     The imdbID
     */
    public String getImdbID() {
        return imdbID;
    }

    /**
     * 
     * @param imdbID
     *     The imdbID
     */
    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }


}
