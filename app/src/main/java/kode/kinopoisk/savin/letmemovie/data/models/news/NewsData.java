
package kode.kinopoisk.savin.letmemovie.data.models.news;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class NewsData {

    @SerializedName("newsData")
    @Expose
    private List<NewsModel> newsData = new ArrayList<NewsModel>();
    @SerializedName("pagesCount")
    @Expose
    private Integer pagesCount;

    /**
     * 
     * @return
     *     The newsData
     */
    public List<NewsModel> getNewsData() {
        return newsData;
    }

    /**
     * 
     * @param newsData
     *     The newsData
     */
    public void setNewsData(List<NewsModel> newsData) {
        this.newsData = newsData;
    }

    /**
     * 
     * @return
     *     The pagesCount
     */
    public Integer getPagesCount() {
        return pagesCount;
    }

    /**
     * 
     * @param pagesCount
     *     The pagesCount
     */
    public void setPagesCount(Integer pagesCount) {
        this.pagesCount = pagesCount;
    }

}
