
package kode.kinopoisk.savin.letmemovie.data.models.filminfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TopNewsByFilm {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("newsDate")
    @Expose
    private String newsDate;
    @SerializedName("newsImagePreviewURL")
    @Expose
    private String newsImagePreviewURL;
    @SerializedName("newsTitle")
    @Expose
    private String newsTitle;
    @SerializedName("newsDescription")
    @Expose
    private String newsDescription;
    @SerializedName("videoURL")
    @Expose
    private String videoURL;

    /**
     * 
     * @return
     *     The iD
     */
    public String getID() {
        return iD;
    }

    /**
     * 
     * @param iD
     *     The ID
     */
    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     * 
     * @return
     *     The newsDate
     */
    public String getNewsDate() {
        return newsDate;
    }

    /**
     * 
     * @param newsDate
     *     The newsDate
     */
    public void setNewsDate(String newsDate) {
        this.newsDate = newsDate;
    }

    /**
     * 
     * @return
     *     The newsImagePreviewURL
     */
    public String getNewsImagePreviewURL() {
        return newsImagePreviewURL;
    }

    /**
     * 
     * @param newsImagePreviewURL
     *     The newsImagePreviewURL
     */
    public void setNewsImagePreviewURL(String newsImagePreviewURL) {
        this.newsImagePreviewURL = newsImagePreviewURL;
    }

    /**
     * 
     * @return
     *     The newsTitle
     */
    public String getNewsTitle() {
        return newsTitle;
    }

    /**
     * 
     * @param newsTitle
     *     The newsTitle
     */
    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    /**
     * 
     * @return
     *     The newsDescription
     */
    public String getNewsDescription() {
        return newsDescription;
    }

    /**
     * 
     * @param newsDescription
     *     The newsDescription
     */
    public void setNewsDescription(String newsDescription) {
        this.newsDescription = newsDescription;
    }

    /**
     * 
     * @return
     *     The videoURL
     */
    public String getVideoURL() {
        return videoURL;
    }

    /**
     * 
     * @param videoURL
     *     The videoURL
     */
    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

}
