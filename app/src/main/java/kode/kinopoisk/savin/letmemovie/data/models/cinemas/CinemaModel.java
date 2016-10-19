
package kode.kinopoisk.savin.letmemovie.data.models.cinemas;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CinemaModel implements Parcelable {

    @SerializedName("class")
    @Expose
    private String _class;
    @SerializedName("cinemaID")
    @Expose
    private String cinemaID;
    @SerializedName("cinemaName")
    @Expose
    private String cinemaName;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("lon")
    @Expose
    private String lon;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("hasNoSeances")
    @Expose
    private Integer hasNoSeances;

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
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The lon
     */
    public String getLon() {
        return lon;
    }

    /**
     * 
     * @param lon
     *     The lon
     */
    public void setLon(String lon) {
        this.lon = lon;
    }

    /**
     * 
     * @return
     *     The lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * 
     * @return
     *     The hasNoSeances
     */
    public Integer getHasNoSeances() {
        return hasNoSeances;
    }

    /**
     * 
     * @param hasNoSeances
     *     The hasNoSeances
     */
    public void setHasNoSeances(Integer hasNoSeances) {
        this.hasNoSeances = hasNoSeances;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this._class);
        dest.writeString(this.cinemaID);
        dest.writeString(this.cinemaName);
        dest.writeString(this.address);
        dest.writeString(this.lon);
        dest.writeString(this.lat);
        dest.writeValue(this.hasNoSeances);
    }

    public CinemaModel() {
    }

    protected CinemaModel(Parcel in) {
        this._class = in.readString();
        this.cinemaID = in.readString();
        this.cinemaName = in.readString();
        this.address = in.readString();
        this.lon = in.readString();
        this.lat = in.readString();
        this.hasNoSeances = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<CinemaModel> CREATOR = new Parcelable.Creator<CinemaModel>() {
        @Override
        public CinemaModel createFromParcel(Parcel source) {
            return new CinemaModel(source);
        }

        @Override
        public CinemaModel[] newArray(int size) {
            return new CinemaModel[size];
        }
    };
}
