package com.example.blogapp1.model;

import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class PostimageModel {

    private String imageURL, id;

    @ServerTimestamp

    private Date timestamp;

    public PostimageModel(String imageURL, String id, Date timestamp) {
        this.imageURL = imageURL;
        this.id = id;
        this.timestamp = timestamp;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}

