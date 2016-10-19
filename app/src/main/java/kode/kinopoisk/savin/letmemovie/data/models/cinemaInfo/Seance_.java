
package kode.kinopoisk.savin.letmemovie.data.models.cinemaInfo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Seance_ {

    @SerializedName("time")
    @Expose
    private String time;

    /**
     * 
     * @return
     *     The time
     */
    public String getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(String time) {
        this.time = time;
    }

}
