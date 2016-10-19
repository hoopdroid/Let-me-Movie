
package kode.kinopoisk.savin.letmemovie.data.models.cinemaInfo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CinemaLocation {

    @SerializedName("lon")
    @Expose
    private String lon;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("addressDescription")
    @Expose
    private String addressDescription;

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
     *     The addressDescription
     */
    public String getAddressDescription() {
        return addressDescription;
    }

    /**
     * 
     * @param addressDescription
     *     The addressDescription
     */
    public void setAddressDescription(String addressDescription) {
        this.addressDescription = addressDescription;
    }

}
