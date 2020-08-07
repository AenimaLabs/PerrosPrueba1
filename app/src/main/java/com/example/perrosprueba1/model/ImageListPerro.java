package com.example.perrosprueba1.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ImageListPerro {

    @SerializedName("message")
    private ArrayList<String> imageUrl;

    public ArrayList<String> getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(ArrayList<String> imageUrl) {
        this.imageUrl = imageUrl;
    }
}
