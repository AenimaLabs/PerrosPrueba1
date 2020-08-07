package com.example.perrosprueba1.api;

import com.example.perrosprueba1.model.ImageListPerro;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIResponse {

    @GET("api/breeds/list/")
    Call<ImageListPerro> getBreedList();

    @GET("api/breed/{breed}/images/")
    Call<ImageListPerro> getBreedImageList(@Path("breed") String breed);


}
