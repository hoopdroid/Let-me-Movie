
package kode.kinopoisk.savin.letmemovie.data.models.movies.movie;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import kode.kinopoisk.savin.letmemovie.util.RatingUtil;


public class SoonMovieModel implements Parcelable,IMovie {

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
    @SerializedName("premiereRU")
    @Expose
    private String premiereRU;

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
        return RatingUtil.getRatingFromString(rating);
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
        dest.writeString(this.rating);
        dest.writeString(this.posterURL);
        dest.writeString(this.filmLength);
        dest.writeString(this.country);
        dest.writeString(this.genre);
        dest.writeParcelable(this.videoURL, flags);
        dest.writeString(this.premiereRU);
    }

    public SoonMovieModel() {
    }

    protected SoonMovieModel(Parcel in) {
        this.type = in.readString();
        this.id = in.readString();
        this.nameRU = in.readString();
        this.nameEN = in.readString();
        this.year = in.readString();
        this.rating = in.readString();
        this.posterURL = in.readString();
        this.filmLength = in.readString();
        this.country = in.readString();
        this.genre = in.readString();
        this.videoURL = in.readParcelable(VideoURL.class.getClassLoader());
        this.premiereRU = in.readString();
    }

    public static final Parcelable.Creator<SoonMovieModel> CREATOR = new Parcelable.Creator<SoonMovieModel>() {
        @Override
        public SoonMovieModel createFromParcel(Parcel source) {
            return new SoonMovieModel(source);
        }

        @Override
        public SoonMovieModel[] newArray(int size) {
            return new SoonMovieModel[size];
        }
    };

}
