package com.RouXinYuan.bean;

/**
 * Created by 13045 on 2018/1/17.
 * 产品类
 */
public class Product {
    private int id;
    private String productName;
    private String productDetails;
    private String productContent;
    private String productCreatetime;
    private String productImageurl;
    private String productUrl;
    private String productStatus;

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductContent() {
        return productContent;
    }

    public void setProductContent(String productContent) {
        this.productContent = productContent;
    }

    public String getProductCreatetime() {
        return productCreatetime;
    }

    public void setProductCreatetime(String productCreatetime) {
        this.productCreatetime = productCreatetime;
    }

    public String getProductImageurl() {
        return productImageurl;
    }

    public void setProductImageurl(String productImageurl) {
        this.productImageurl = productImageurl;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productDetails='" + productDetails + '\'' +
                ", productContent='" + productContent + '\'' +
                ", productCreatetime='" + productCreatetime + '\'' +
                ", productImageurl='" + productImageurl + '\'' +
                ", productUrl='" + productUrl + '\'' +
                ", productStatus='" + productStatus + '\'' +
                '}';
    }
}
