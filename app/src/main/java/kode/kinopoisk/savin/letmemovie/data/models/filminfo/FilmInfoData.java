
package kode.kinopoisk.savin.letmemovie.data.models.filminfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FilmInfoData {

    @SerializedName("hasSimilarFilms")
    @Expose
    private Integer hasSimilarFilms;
    @SerializedName("reviewsCount")
    @Expose
    private Integer reviewsCount;
    @SerializedName("ratingData")
    @Expose
    private RatingData ratingData;
    @SerializedName("hasRelatedFilms")
    @Expose
    private Integer hasRelatedFilms;
    @SerializedName("filmID")
    @Expose
    private String filmID;
    @SerializedName("webURL")
    @Expose
    private String webURL;
    @SerializedName("nameRU")
    @Expose
    private String nameRU;
    @SerializedName("nameEN")
    @Expose
    private String nameEN;
    @SerializedName("posterURL")
    @Expose
    private String posterURL;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("filmLength")
    @Expose
    private String filmLength;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("slogan")
    @Expose
    private String slogan;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("videoURL")
    @Expose
    private VideoURL videoURL;
    @SerializedName("ratingMPAA")
    @Expose
    private String ratingMPAA;
    @SerializedName("ratingAgeLimits")
    @Expose
    private String ratingAgeLimits;
    @SerializedName("hasSeance")
    @Expose
    private Integer hasSeance;
    @SerializedName("rentData")
    @Expose
    private RentData rentData;
    @SerializedName("budgetData")
    @Expose
    private BudgetData budgetData;
    @SerializedName("gallery")
    @Expose
    private List<Gallery> gallery = new ArrayList<Gallery>();
    @SerializedName("creators")
    @Expose
    private List<List<Creator>> creators = new ArrayList<List<Creator>>();
    @SerializedName("topNewsByFilm")
    @Expose
    private TopNewsByFilm topNewsByFilm;
    @SerializedName("triviaData")
    @Expose
    private List<String> triviaData = new ArrayList<String>();
    @SerializedName("imdbID")
    @Expose
    private String imdbID;

    /**
     * 
     * @return
     *     The hasSimilarFilms
     */
    public Integer getHasSimilarFilms() {
        return hasSimilarFilms;
    }

    /**
     * 
     * @param hasSimilarFilms
     *     The hasSimilarFilms
     */
    public void setHasSimilarFilms(Integer hasSimilarFilms) {
        this.hasSimilarFilms = hasSimilarFilms;
    }

    /**
     * 
     * @return
     *     The reviewsCount
     */
    public Integer getReviewsCount() {
        return reviewsCount;
    }

    /**
     * 
     * @param reviewsCount
     *     The reviewsCount
     */
    public void setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    /**
     * 
     * @return
     *     The ratingData
     */
    public RatingData getRatingData() {
        return ratingData;
    }

    /**
     * 
     * @param ratingData
     *     The ratingData
     */
    public void setRatingData(RatingData ratingData) {
        this.ratingData = ratingData;
    }

    /**
     * 
     * @return
     *     The hasRelatedFilms
     */
    public Integer getHasRelatedFilms() {
        return hasRelatedFilms;
    }

    /**
     * 
     * @param hasRelatedFilms
     *     The hasRelatedFilms
     */
    public void setHasRelatedFilms(Integer hasRelatedFilms) {
        this.hasRelatedFilms = hasRelatedFilms;
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
     *     The webURL
     */
    public String getWebURL() {
        return webURL;
    }

    /**
     * 
     * @param webURL
     *     The webURL
     */
    public void setWebURL(String webURL) {
        this.webURL = webURL;
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
     *     The slogan
     */
    public String getSlogan() {
        return slogan;
    }

    /**
     * 
     * @param slogan
     *     The slogan
     */
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
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
     *     The ratingMPAA
     */
    public String getRatingMPAA() {
        return ratingMPAA;
    }

    /**
     * 
     * @param ratingMPAA
     *     The ratingMPAA
     */
    public void setRatingMPAA(String ratingMPAA) {
        this.ratingMPAA = ratingMPAA;
    }

    /**
     * 
     * @return
     *     The ratingAgeLimits
     */
    public String getRatingAgeLimits() {
        return ratingAgeLimits;
    }

    /**
     * 
     * @param ratingAgeLimits
     *     The ratingAgeLimits
     */
    public void setRatingAgeLimits(String ratingAgeLimits) {
        this.ratingAgeLimits = ratingAgeLimits;
    }

    /**
     * 
     * @return
     *     The hasSeance
     */
    public Integer getHasSeance() {
        return hasSeance;
    }

    /**
     * 
     * @param hasSeance
     *     The hasSeance
     */
    public void setHasSeance(Integer hasSeance) {
        this.hasSeance = hasSeance;
    }

    /**
     * 
     * @return
     *     The rentData
     */
    public RentData getRentData() {
        return rentData;
    }

    /**
     * 
     * @param rentData
     *     The rentData
     */
    public void setRentData(RentData rentData) {
        this.rentData = rentData;
    }

    /**
     * 
     * @return
     *     The budgetData
     */
    public BudgetData getBudgetData() {
        return budgetData;
    }

    /**
     * 
     * @param budgetData
     *     The budgetData
     */
    public void setBudgetData(BudgetData budgetData) {
        this.budgetData = budgetData;
    }

    /**
     * 
     * @return
     *     The gallery
     */
    public List<Gallery> getGallery() {
        return gallery;
    }

    /**
     * 
     * @param gallery
     *     The gallery
     */
    public void setGallery(List<Gallery> gallery) {
        this.gallery = gallery;
    }

    /**
     * 
     * @return
     *     The creators
     */
    public List<List<Creator>> getCreators() {
        return creators;
    }

    /**
     * 
     * @param creators
     *     The creators
     */
    public void setCreators(List<List<Creator>> creators) {
        this.creators = creators;
    }

    /**
     * 
     * @return
     *     The topNewsByFilm
     */
    public TopNewsByFilm getTopNewsByFilm() {
        return topNewsByFilm;
    }

    /**
     * 
     * @param topNewsByFilm
     *     The topNewsByFilm
     */
    public void setTopNewsByFilm(TopNewsByFilm topNewsByFilm) {
        this.topNewsByFilm = topNewsByFilm;
    }

    /**
     * 
     * @return
     *     The triviaData
     */
    public List<String> getTriviaData() {
        return triviaData;
    }

    /**
     * 
     * @param triviaData
     *     The triviaData
     */
    public void setTriviaData(List<String> triviaData) {
        this.triviaData = triviaData;
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
