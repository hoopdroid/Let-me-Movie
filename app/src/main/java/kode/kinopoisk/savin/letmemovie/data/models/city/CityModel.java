
package kode.kinopoisk.savin.letmemovie.data.models.city;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CityModel {

    @SerializedName("cityID")
    @Expose
    private String cityID;
    @SerializedName("cityName")
    @Expose
    private String cityName;

    /**
     * 
     * @return
     *     The cityID
     */
    public String getCityID() {
        return cityID;
    }

    /**
     * 
     * @param cityID
     *     The cityID
     */
    public void setCityID(String cityID) {
        this.cityID = cityID;
    }

    /**
     * 
     * @return
     *     The cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 
     * @param cityName
     *     The cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

}
