
package kode.kinopoisk.savin.letmemovie.data.models.cinemas;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class CinemaData {

    @SerializedName("cityID")
    @Expose
    private String cityID;
    @SerializedName("cityName")
    @Expose
    private String cityName;
    @SerializedName("items")
    @Expose
    private List<CinemaModel> cinemaModels = new ArrayList<CinemaModel>();

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

    /**
     * 
     * @return
     *     The items
     */
    public List<CinemaModel> getCinemaModels() {
        return cinemaModels;
    }

    /**
     * 
     * @param cinemaModels
     *     The items
     */
    public void setCinemaModels(List<CinemaModel> cinemaModels) {
        this.cinemaModels = cinemaModels;
    }


}


