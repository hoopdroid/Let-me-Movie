
package kode.kinopoisk.savin.letmemovie.data.models.cinemaInfo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CinemaDetail {

    @SerializedName("cinemaID")
    @Expose
    private String cinemaID;
    @SerializedName("cinemaName")
    @Expose
    private String cinemaName;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("voteCount")
    @Expose
    private String voteCount;
    @SerializedName("cinemaLocation")
    @Expose
    private CinemaLocation cinemaLocation;
    @SerializedName("cinemaTelephone")
    @Expose
    private String cinemaTelephone;
    @SerializedName("cinemaWeb")
    @Expose
    private String cinemaWeb;
    @SerializedName("cinemaUrl")
    @Expose
    private String cinemaUrl;
    @SerializedName("seance")
    @Expose
    private Seance seance;

    /**
     * 
     * @return
     *     The cinemaID
     */
    public String getCinemaID() {
        return cinemaID;
    }

    /**
     * 
     * @param cinemaID
     *     The cinemaID
     */
    public void setCinemaID(String cinemaID) {
        this.cinemaID = cinemaID;
    }

    /**
     * 
     * @return
     *     The cinemaName
     */
    public String getCinemaName() {
        return cinemaName;
    }

    /**
     * 
     * @param cinemaName
     *     The cinemaName
     */
    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
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
     *     The voteCount
     */
    public String getVoteCount() {
        return voteCount;
    }

    /**
     * 
     * @param voteCount
     *     The voteCount
     */
    public void setVoteCount(String voteCount) {
        this.voteCount = voteCount;
    }

    /**
     * 
     * @return
     *     The cinemaLocation
     */
    public CinemaLocation getCinemaLocation() {
        return cinemaLocation;
    }

    /**
     * 
     * @param cinemaLocation
     *     The cinemaLocation
     */
    public void setCinemaLocation(CinemaLocation cinemaLocation) {
        this.cinemaLocation = cinemaLocation;
    }

    /**
     * 
     * @return
     *     The cinemaTelephone
     */
    public String getCinemaTelephone() {
        return cinemaTelephone;
    }

    /**
     * 
     * @param cinemaTelephone
     *     The cinemaTelephone
     */
    public void setCinemaTelephone(String cinemaTelephone) {
        this.cinemaTelephone = cinemaTelephone;
    }

    /**
     * 
     * @return
     *     The cinemaWeb
     */
    public String getCinemaWeb() {
        return cinemaWeb;
    }

    /**
     * 
     * @param cinemaWeb
     *     The cinemaWeb
     */
    public void setCinemaWeb(String cinemaWeb) {
        this.cinemaWeb = cinemaWeb;
    }

    /**
     * 
     * @return
     *     The cinemaUrl
     */
    public String getCinemaUrl() {
        return cinemaUrl;
    }

    /**
     * 
     * @param cinemaUrl
     *     The cinemaUrl
     */
    public void setCinemaUrl(String cinemaUrl) {
        this.cinemaUrl = cinemaUrl;
    }

    /**
     * 
     * @return
     *     The seance
     */
    public Seance getSeance() {
        return seance;
    }

    /**
     * 
     * @param seance
     *     The seance
     */
    public void setSeance(Seance seance) {
        this.seance = seance;
    }

}
