
package kode.kinopoisk.savin.letmemovie.data.models.filminfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Creator {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("nameRU")
    @Expose
    private String nameRU;
    @SerializedName("nameEN")
    @Expose
    private String nameEN;
    @SerializedName("posterURL")
    @Expose
    private String posterURL;
    @SerializedName("professionText")
    @Expose
    private String professionText;
    @SerializedName("professionKey")
    @Expose
    private String professionKey;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The nameRU
     */
    public String getNameRU() {
        return nameRU;
    }

    /**
     * 
     * @param nameRU
     *     The nameRU
     */
    public void setNameRU(String nameRU) {
        this.nameRU = nameRU;
    }

    /**
     * 
     * @return
     *     The nameEN
     */
    public String getNameEN() {
        return nameEN;
    }

    /**
     * 
     * @param nameEN
     *     The nameEN
     */
    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    /**
     * 
     * @return
     *     The posterURL
     */
    public String getPosterURL() {
        return posterURL;
    }

    /**
     * 
     * @param posterURL
     *     The posterURL
     */
    public void setPosterURL(String posterURL) {
        this.posterURL = posterURL;
    }

    /**
     * 
     * @return
     *     The professionText
     */
    public String getProfessionText() {
        return professionText;
    }

    /**
     * 
     * @param professionText
     *     The professionText
     */
    public void setProfessionText(String professionText) {
        this.professionText = professionText;
    }

    /**
     * 
     * @return
     *     The professionKey
     */
    public String getProfessionKey() {
        return professionKey;
    }

    /**
     * 
     * @param professionKey
     *     The professionKey
     */
    public void setProfessionKey(String professionKey) {
        this.professionKey = professionKey;
    }

}
