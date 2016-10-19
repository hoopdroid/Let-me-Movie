
package kode.kinopoisk.savin.letmemovie.data.models.filminfo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class VideoURL {

    @SerializedName("hd")
    @Expose
    private String hd;
    @SerializedName("sd")
    @Expose
    private String sd;
    @SerializedName("low")
    @Expose
    private String low;

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

    /**
     * 
     * @return
     *     The low
     */
    public String getLow() {
        return low;
    }

    /**
     * 
     * @param low
     *     The low
     */
    public void setLow(String low) {
        this.low = low;
    }

}
