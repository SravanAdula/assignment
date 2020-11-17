package com.example.myapplication.models;

public class User {
    String title;
    String ratings;
    String description;
    Integer adminImages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAdminImages() {
        return adminImages;
    }

    public void setAdminImages(Integer adminImages) {
        this.adminImages = adminImages;
    }

    public User(String title, String ratings, String description, Integer adminImages) {
        this.title = title;
        this.ratings = ratings;
        this.description = description;
        this.adminImages = adminImages;
    }







    }



