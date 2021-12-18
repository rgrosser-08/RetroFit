package com.example.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    /*
    Retrofit get annotation with our URL
    And our method that will return us the List of ContactList
    */
    String BASE_URL = "https://my-json-server.typicode.com/rgrosser-08/jsondb";
    @GET("/jsondb/db")
    Call<ArtistList> getArtists();
}