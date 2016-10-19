
package kode.kinopoisk.savin.letmemovie.data.models.filminfo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gallery {

    @SerializedName("preview")
    @Expose
    private String preview;

    /**
     * 
     * @return
     *     The preview
     */
    public String getPreview() {
        return preview;
    }

    /**
     * 
     * @param preview
     *     The preview
     */
    public void setPreview(String preview) {
        this.preview = preview;
    }

}
