package com.example.retrofit;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ArtistList {
    @SerializedName("artists")
    @Expose
    private ArrayList<Artist> artists = null;

    public ArrayList<Artist> getArtists() {
        return artists;
    }
    public void setArtists(ArrayList<Artist> artists) {
        this.artists = artists;
    }
}
