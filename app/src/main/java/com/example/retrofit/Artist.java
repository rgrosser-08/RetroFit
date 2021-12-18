package com.example.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.text.BreakIterator;

public class Artist {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("bestSong")
    @Expose
    private String best_song;
    @SerializedName("worstSong")
    @Expose
    private String worst_song;
    @SerializedName("genre")
    @Expose
    private String genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBest_song() {
        return best_song;
    }

    public void setBest_song(String best_song) {
        this.best_song = best_song;
    }

    public String getWorst_song() {
        return worst_song;
    }

    public void setWorst_song(String worst_song) {
        this.worst_song = worst_song;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
