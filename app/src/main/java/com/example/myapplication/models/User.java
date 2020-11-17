package com.example.myapplication.models;

public class User {
    String title;

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

    String ratings;
    String description;

    public User(String title, String ratings, String description) {
        this.title = title;
        this.ratings = ratings;
        this.description = description;
    }


}
