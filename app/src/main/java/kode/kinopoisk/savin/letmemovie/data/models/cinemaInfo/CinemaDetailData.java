
package kode.kinopoisk.savin.letmemovie.data.models.cinemaInfo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CinemaDetailData {

    @SerializedName("cinemaDetail")
    @Expose
    private CinemaDetail cinemaDetail;

    /**
     * 
     * @return
     *     The cinemaDetail
     */
    public CinemaDetail getCinemaDetail() {
        return cinemaDetail;
    }

    /**
     * 
     * @param cinemaDetail
     *     The cinemaDetail
     */
    public void setCinemaDetail(CinemaDetail cinemaDetail) {
        this.cinemaDetail = cinemaDetail;
    }

}
