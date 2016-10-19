
package kode.kinopoisk.savin.letmemovie.data.models.cinemaInfo;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Item {

    @SerializedName("class")
    @Expose
    private String _class;
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
    @SerializedName("is3D")
    @Expose
    private Integer is3D;
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
    @SerializedName("seance")
    @Expose
    private List<Seance_> seance = new ArrayList<Seance_>();
    @SerializedName("videoURL")
    @Expose
    private VideoURL videoURL;
    @SerializedName("seance3D")
    @Expose
    private List<Seance3D> seance3D = new ArrayList<Seance3D>();

    /**
     * 
     * @return
     *     The _class
     */
    public String getClass_() {
        return _class;
    }

    /**
     * 
     * @param _class
     *     The class
     */
    public void setClass_(String _class) {
        this._class = _class;
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
     *     The is3D
     */
    public Integer getIs3D() {
        return is3D;
    }

    /**
     * 
     * @param is3D
     *     The is3D
     */
    public void setIs3D(Integer is3D) {
        this.is3D = is3D;
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
     *     The seance
     */
    public List<Seance_> getSeance() {
        return seance;
    }

    /**
     * 
     * @param seance
     *     The seance
     */
    public void setSeance(List<Seance_> seance) {
        this.seance = seance;
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
     *     The seance3D
     */
    public List<Seance3D> getSeance3D() {
        return seance3D;
    }

    /**
     * 
     * @param seance3D
     *     The seance3D
     */
    public void setSeance3D(List<Seance3D> seance3D) {
        this.seance3D = seance3D;
    }

}
