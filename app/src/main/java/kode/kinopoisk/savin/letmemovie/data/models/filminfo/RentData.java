
package kode.kinopoisk.savin.letmemovie.data.models.filminfo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RentData {

    @SerializedName("premiereRU")
    @Expose
    private String premiereRU;
    @SerializedName("Distributors")
    @Expose
    private String distributors;
    @SerializedName("premiereWorld")
    @Expose
    private String premiereWorld;
    @SerializedName("premiereWorldCountry")
    @Expose
    private String premiereWorldCountry;

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
     *     The distributors
     */
    public String getDistributors() {
        return distributors;
    }

    /**
     * 
     * @param distributors
     *     The Distributors
     */
    public void setDistributors(String distributors) {
        this.distributors = distributors;
    }

    /**
     * 
     * @return
     *     The premiereWorld
     */
    public String getPremiereWorld() {
        return premiereWorld;
    }

    /**
     * 
     * @param premiereWorld
     *     The premiereWorld
     */
    public void setPremiereWorld(String premiereWorld) {
        this.premiereWorld = premiereWorld;
    }

    /**
     * 
     * @return
     *     The premiereWorldCountry
     */
    public String getPremiereWorldCountry() {
        return premiereWorldCountry;
    }

    /**
     * 
     * @param premiereWorldCountry
     *     The premiereWorldCountry
     */
    public void setPremiereWorldCountry(String premiereWorldCountry) {
        this.premiereWorldCountry = premiereWorldCountry;
    }

}
