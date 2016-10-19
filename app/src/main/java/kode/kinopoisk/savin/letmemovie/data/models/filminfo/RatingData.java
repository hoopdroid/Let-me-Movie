
package kode.kinopoisk.savin.letmemovie.data.models.filminfo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatingData {

    @SerializedName("ratingGoodReview")
    @Expose
    private String ratingGoodReview;
    @SerializedName("ratingGoodReviewVoteCount")
    @Expose
    private Integer ratingGoodReviewVoteCount;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("ratingVoteCount")
    @Expose
    private String ratingVoteCount;
    @SerializedName("ratingAwait")
    @Expose
    private String ratingAwait;
    @SerializedName("ratingAwaitCount")
    @Expose
    private String ratingAwaitCount;
    @SerializedName("ratingIMDb")
    @Expose
    private String ratingIMDb;
    @SerializedName("ratingIMDbVoteCount")
    @Expose
    private String ratingIMDbVoteCount;
    @SerializedName("ratingFilmCritics")
    @Expose
    private String ratingFilmCritics;
    @SerializedName("ratingFilmCriticsVoteCount")
    @Expose
    private String ratingFilmCriticsVoteCount;
    @SerializedName("ratingRFCritics")
    @Expose
    private String ratingRFCritics;
    @SerializedName("ratingRFCriticsVoteCount")
    @Expose
    private Integer ratingRFCriticsVoteCount;

    /**
     * 
     * @return
     *     The ratingGoodReview
     */
    public String getRatingGoodReview() {
        return ratingGoodReview;
    }

    /**
     * 
     * @param ratingGoodReview
     *     The ratingGoodReview
     */
    public void setRatingGoodReview(String ratingGoodReview) {
        this.ratingGoodReview = ratingGoodReview;
    }

    /**
     * 
     * @return
     *     The ratingGoodReviewVoteCount
     */
    public Integer getRatingGoodReviewVoteCount() {
        return ratingGoodReviewVoteCount;
    }

    /**
     * 
     * @param ratingGoodReviewVoteCount
     *     The ratingGoodReviewVoteCount
     */
    public void setRatingGoodReviewVoteCount(Integer ratingGoodReviewVoteCount) {
        this.ratingGoodReviewVoteCount = ratingGoodReviewVoteCount;
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
     *     The ratingVoteCount
     */
    public String getRatingVoteCount() {
        return ratingVoteCount;
    }

    /**
     * 
     * @param ratingVoteCount
     *     The ratingVoteCount
     */
    public void setRatingVoteCount(String ratingVoteCount) {
        this.ratingVoteCount = ratingVoteCount;
    }

    /**
     * 
     * @return
     *     The ratingAwait
     */
    public String getRatingAwait() {
        return ratingAwait;
    }

    /**
     * 
     * @param ratingAwait
     *     The ratingAwait
     */
    public void setRatingAwait(String ratingAwait) {
        this.ratingAwait = ratingAwait;
    }

    /**
     * 
     * @return
     *     The ratingAwaitCount
     */
    public String getRatingAwaitCount() {
        return ratingAwaitCount;
    }

    /**
     * 
     * @param ratingAwaitCount
     *     The ratingAwaitCount
     */
    public void setRatingAwaitCount(String ratingAwaitCount) {
        this.ratingAwaitCount = ratingAwaitCount;
    }

    /**
     * 
     * @return
     *     The ratingIMDb
     */
    public String getRatingIMDb() {
        return ratingIMDb;
    }

    /**
     * 
     * @param ratingIMDb
     *     The ratingIMDb
     */
    public void setRatingIMDb(String ratingIMDb) {
        this.ratingIMDb = ratingIMDb;
    }

    /**
     * 
     * @return
     *     The ratingIMDbVoteCount
     */
    public String getRatingIMDbVoteCount() {
        return ratingIMDbVoteCount;
    }

    /**
     * 
     * @param ratingIMDbVoteCount
     *     The ratingIMDbVoteCount
     */
    public void setRatingIMDbVoteCount(String ratingIMDbVoteCount) {
        this.ratingIMDbVoteCount = ratingIMDbVoteCount;
    }

    /**
     * 
     * @return
     *     The ratingFilmCritics
     */
    public String getRatingFilmCritics() {
        return ratingFilmCritics;
    }

    /**
     * 
     * @param ratingFilmCritics
     *     The ratingFilmCritics
     */
    public void setRatingFilmCritics(String ratingFilmCritics) {
        this.ratingFilmCritics = ratingFilmCritics;
    }

    /**
     * 
     * @return
     *     The ratingFilmCriticsVoteCount
     */
    public String getRatingFilmCriticsVoteCount() {
        return ratingFilmCriticsVoteCount;
    }

    /**
     * 
     * @param ratingFilmCriticsVoteCount
     *     The ratingFilmCriticsVoteCount
     */
    public void setRatingFilmCriticsVoteCount(String ratingFilmCriticsVoteCount) {
        this.ratingFilmCriticsVoteCount = ratingFilmCriticsVoteCount;
    }

    /**
     * 
     * @return
     *     The ratingRFCritics
     */
    public String getRatingRFCritics() {
        return ratingRFCritics;
    }

    /**
     * 
     * @param ratingRFCritics
     *     The ratingRFCritics
     */
    public void setRatingRFCritics(String ratingRFCritics) {
        this.ratingRFCritics = ratingRFCritics;
    }

    /**
     * 
     * @return
     *     The ratingRFCriticsVoteCount
     */
    public Integer getRatingRFCriticsVoteCount() {
        return ratingRFCriticsVoteCount;
    }

    /**
     * 
     * @param ratingRFCriticsVoteCount
     *     The ratingRFCriticsVoteCount
     */
    public void setRatingRFCriticsVoteCount(Integer ratingRFCriticsVoteCount) {
        this.ratingRFCriticsVoteCount = ratingRFCriticsVoteCount;
    }

}
