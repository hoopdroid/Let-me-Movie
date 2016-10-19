
package kode.kinopoisk.savin.letmemovie.data.models.staff;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StaffMovieData {

    @SerializedName("creators")
    @Expose
    private List<List<StaffMovieModel>> creators = new ArrayList<List<StaffMovieModel>>();

    /**
     * 
     * @return
     *     The creators
     */
    public List<List<StaffMovieModel>> getCreators() {
        return creators;
    }

    /**
     * 
     * @param creators
     *     The creators
     */
    public void setCreators(List<List<StaffMovieModel>> creators) {
        this.creators = creators;
    }

}
