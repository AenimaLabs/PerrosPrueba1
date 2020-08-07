package com.example.perrosprueba1.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListPerro {

    @SerializedName("message")
    private List<String> breedlist;
    private String status;

    public List<String> getBreedlist() {
        return breedlist;
    }

    public void setBreedlist(List<String> breedlist) {
        this.breedlist = breedlist;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
