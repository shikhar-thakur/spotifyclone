package com.playlist.PlayListService.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Playlist {
    @Id

    private String playlistName;
    private String song;


    public Playlist() {
    }

    public Playlist(String playlistName, String song) {
        this.playlistName = playlistName;
        this.song = song;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlistName='" + playlistName + '\'' +
                ", song='" + song + '\'' +
                '}';
    }
}
