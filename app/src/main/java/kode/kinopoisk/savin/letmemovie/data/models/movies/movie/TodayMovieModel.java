
package kode.kinopoisk.savin.letmemovie.data.models.movies.movie;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import kode.kinopoisk.savin.letmemovie.util.RatingUtil;


public class TodayMovieModel implements Parcelable,IMovie {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("nameRU")
    @Expose
    private String nameRU;
    @SerializedName("nameEN")
    @Expose
    private String nameEN;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("cinemaHallCount")
    @Expose
    private String cinemaHallCount;
    @SerializedName("isNew")
    @Expose
    private Integer isNew;
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
    @SerializedName("premiereRU")
    @Expose
    private String premiereRU;
    @SerializedName("videoURL")
    @Expose
    private VideoURL videoURL;
    @SerializedName("isIMAX")
    @Expose
    private Integer isIMAX;

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
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
     *     The cinemaHallCount
     */
    public String getCinemaHallCount() {
        return cinemaHallCount;
    }

    /**
     * 
     * @param cinemaHallCount
     *     The cinemaHallCount
     */
    public void setCinemaHallCount(String cinemaHallCount) {
        this.cinemaHallCount = cinemaHallCount;
    }

    /**
     * 
     * @return
     *     The isNew
     */
    public Integer getIsNew() {
        return isNew;
    }

    /**
     * 
     * @param isNew
     *     The isNew
     */
    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
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

    @Override
    public float getComparableRating() {
        if (rating!=null)
        return RatingUtil.getRatingFromString(rating);
        else return 5;
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
     *     The premiereRU
     */
    public String getPremiereRU() {
        return premiereRU;
    }

    /**
     * 
     * @param premiereRU
     *     The premiereRU
     */
    public void setPremiereRU(String premiereRU) {
        this.premiereRU = premiereRU;
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
     *     The isIMAX
     */
    public Integer getIsIMAX() {
        return isIMAX;
    }

    /**
     * 
     * @param isIMAX
     *     The isIMAX
     */
    public void setIsIMAX(Integer isIMAX) {
        this.isIMAX = isIMAX;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.type);
        dest.writeString(this.id);
        dest.writeString(this.nameRU);
        dest.writeString(this.nameEN);
        dest.writeString(this.year);
        dest.writeString(this.cinemaHallCount);
        dest.writeValue(this.isNew);
        dest.writeString(this.rating);
        dest.writeString(this.posterURL);
        dest.writeString(this.filmLength);
        dest.writeString(this.country);
        dest.writeString(this.genre);
        dest.writeString(this.premiereRU);
        dest.writeParcelable(this.videoURL, flags);
        dest.writeValue(this.isIMAX);
    }

    public TodayMovieModel() {
    }

    protected TodayMovieModel(Parcel in) {
        this.type = in.readString();
        this.id = in.readString();
        this.nameRU = in.readString();
        this.nameEN = in.readString();
        this.year = in.readString();
        this.cinemaHallCount = in.readString();
        this.isNew = (Integer) in.readValue(Integer.class.getClassLoader());
        this.rating = in.readString();
        this.posterURL = in.readString();
        this.filmLength = in.readString();
        this.country = in.readString();
        this.genre = in.readString();
        this.premiereRU = in.readString();
        this.videoURL = in.readParcelable(VideoURL.class.getClassLoader());
        this.isIMAX = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<TodayMovieModel> CREATOR = new Parcelable.Creator<TodayMovieModel>() {
        @Override
        public TodayMovieModel createFromParcel(Parcel source) {
            return new TodayMovieModel(source);
        }

        @Override
        public TodayMovieModel[] newArray(int size) {
            return new TodayMovieModel[size];
        }
    };

}
