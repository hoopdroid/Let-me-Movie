
package kode.kinopoisk.savin.letmemovie.data.models.filminfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

;


public class BudgetData {

    @SerializedName("grossRU")
    @Expose
    private String grossRU;
    @SerializedName("grossUSA")
    @Expose
    private String grossUSA;
    @SerializedName("grossWorld")
    @Expose
    private String grossWorld;
    @SerializedName("budget")
    @Expose
    private String budget;

    /**
     * 
     * @return
     *     The grossRU
     */
    public String getGrossRU() {
        return grossRU;
    }

    /**
     * 
     * @param grossRU
     *     The grossRU
     */
    public void setGrossRU(String grossRU) {
        this.grossRU = grossRU;
    }

    /**
     * 
     * @return
     *     The grossUSA
     */
    public String getGrossUSA() {
        return grossUSA;
    }

    /**
     * 
     * @param grossUSA
     *     The grossUSA
     */
    public void setGrossUSA(String grossUSA) {
        this.grossUSA = grossUSA;
    }

    /**
     * 
     * @return
     *     The grossWorld
     */
    public String getGrossWorld() {
        return grossWorld;
    }

    /**
     * 
     * @param grossWorld
     *     The grossWorld
     */
    public void setGrossWorld(String grossWorld) {
        this.grossWorld = grossWorld;
    }

    /**
     * 
     * @return
     *     The budget
     */
    public String getBudget() {
        return budget;
    }

    /**
     * 
     * @param budget
     *     The budget
     */
    public void setBudget(String budget) {
        this.budget = budget;
    }

}
