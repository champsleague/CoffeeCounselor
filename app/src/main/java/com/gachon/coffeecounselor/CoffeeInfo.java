package com.gachon.coffeecounselor;

public class CoffeeInfo
{

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCaffe() {
        return caffe;
    }

    public void setCaffe(String caffe) {
        this.caffe = caffe;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    private String imageUrl;
    private String title;
    private String price;
    private String info;
    private String caffe;
    private float rating;

}
