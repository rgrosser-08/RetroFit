package com.example.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    /*
    Retrofit get annotation with our URL
    And our method that will return us the List of ContactList
    */
    @GET("rgrosser-08/jsondb/db")
    Call<ArtistList> getArtists();
}