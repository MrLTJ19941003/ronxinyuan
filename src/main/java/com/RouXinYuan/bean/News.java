package com.RouXinYuan.bean;

/**
 * Created by 13045 on 2018/1/18.
 */
public class News {
    private int id;
    private String newsName;
    private String newsUrl;
    private String newsContent;
    private String newsTime;
    private String newsStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(String newsTime) {
        this.newsTime = newsTime;
    }

    public String getNewsStatus() {
        return newsStatus;
    }

    public void setNewsStatus(String newsStatus) {
        this.newsStatus = newsStatus;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", newsName='" + newsName + '\'' +
                ", newsUrl='" + newsUrl + '\'' +
                ", newsContent='" + newsContent + '\'' +
                ", newsTime='" + newsTime + '\'' +
                ", newsStatus='" + newsStatus + '\'' +
                '}';
    }
}
