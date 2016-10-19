
package kode.kinopoisk.savin.letmemovie.data.models.seances;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SeanceModel implements Parcelable {

    @SerializedName("cinemaID")
    @Expose
    private Integer cinemaID;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("lon")
    @Expose
    private String lon;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("cinemaName")
    @Expose
    private String cinemaName;
    @SerializedName("seance")
    @Expose
    private List<SeanceTime> seanceTime = new ArrayList<SeanceTime>();
    @SerializedName("seance3D")
    @Expose
    private List<Seance3D> seance3D = new ArrayList<Seance3D>();

    /**
     * 
     * @return
     *     The cinemaID
     */
    public Integer getCinemaID() {
        return cinemaID;
    }

    /**
     * 
     * @param cinemaID
     *     The cinemaID
     */
    public void setCinemaID(Integer cinemaID) {
        this.cinemaID = cinemaID;
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
     *     The seance
     */
    public List<SeanceTime> getSeanceTime() {
        return seanceTime;
    }

    /**
     * 
     * @param seanceTime
     *     The seance
     */
    public void setSeanceTime(List<SeanceTime> seanceTime) {
        this.seanceTime = seanceTime;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.cinemaID);
        dest.writeString(this.address);
        dest.writeString(this.lon);
        dest.writeString(this.lat);
        dest.writeString(this.cinemaName);
        dest.writeList(this.seanceTime);
        dest.writeList(this.seance3D);
    }

    public SeanceModel() {
    }

    protected SeanceModel(Parcel in) {
        this.cinemaID = (Integer) in.readValue(Integer.class.getClassLoader());
        this.address = in.readString();
        this.lon = in.readString();
        this.lat = in.readString();
        this.cinemaName = in.readString();
        this.seanceTime = new ArrayList<SeanceTime>();
        in.readList(this.seanceTime, SeanceTime.class.getClassLoader());
        this.seance3D = new ArrayList<Seance3D>();
        in.readList(this.seance3D, Seance3D.class.getClassLoader());
    }

    public static final Parcelable.Creator<SeanceModel> CREATOR = new Parcelable.Creator<SeanceModel>() {
        @Override
        public SeanceModel createFromParcel(Parcel source) {
            return new SeanceModel(source);
        }

        @Override
        public SeanceModel[] newArray(int size) {
            return new SeanceModel[size];
        }
    };
}
