
package kode.kinopoisk.savin.letmemovie.data.models.city;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CitiesData {

    @SerializedName("countryID")
    @Expose
    private String countryID;
    @SerializedName("countryName")
    @Expose
    private String countryName;
    @SerializedName("cityData")
    @Expose
    private List<CityModel> cityData = new ArrayList<CityModel>();

    /**
     * 
     * @return
     *     The countryID
     */
    public String getCountryID() {
        return countryID;
    }

    /**
     * 
     * @param countryID
     *     The countryID
     */
    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    /**
     * 
     * @return
     *     The countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 
     * @param countryName
     *     The countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 
     * @return
     *     The cityData
     */
    public List<CityModel> getCityData() {
        return cityData;
    }

    /**
     * 
     * @param cityData
     *     The cityData
     */
    public void setCityData(List<CityModel> cityData) {
        this.cityData = cityData;
    }


}
