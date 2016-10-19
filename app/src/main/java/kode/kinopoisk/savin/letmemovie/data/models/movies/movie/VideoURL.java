
package kode.kinopoisk.savin.letmemovie.data.models.movies.movie;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VideoURL implements Parcelable {

    @SerializedName("hd")
    @Expose
    private String hd;
    @SerializedName("sd")
    @Expose
    private String sd;

    /**
     * 
     * @return
     *     The hd
     */
    public String getHd() {
        return hd;
    }

    /**
     * 
     * @param hd
     *     The hd
     */
    public void setHd(String hd) {
        this.hd = hd;
    }

    /**
     * 
     * @return
     *     The sd
     */
    public String getSd() {
        return sd;
    }

    /**
     * 
     * @param sd
     *     The sd
     */
    public void setSd(String sd) {
        this.sd = sd;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.hd);
        dest.writeString(this.sd);
    }

    public VideoURL() {
    }

    protected VideoURL(Parcel in) {
        this.hd = in.readString();
        this.sd = in.readString();
    }

    public static final Parcelable.Creator<VideoURL> CREATOR = new Parcelable.Creator<VideoURL>() {
        @Override
        public VideoURL createFromParcel(Parcel source) {
            return new VideoURL(source);
        }

        @Override
        public VideoURL[] newArray(int size) {
            return new VideoURL[size];
        }
    };
}
