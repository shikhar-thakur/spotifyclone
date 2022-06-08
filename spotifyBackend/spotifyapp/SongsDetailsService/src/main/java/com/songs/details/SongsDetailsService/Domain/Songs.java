package com.songs.details.SongsDetailsService.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Songs {

    @Id
    private String playlistName;
    private int songId;
    private String song;
    private String artist;
    private int songId1;
    private String song1;
    private String artist1;
    private int songId2;
    private String song2;
    private String artist2;
    private int songId3;
    private String song3;
    private String artist3;
    private int songId4;
    private String song4;
    private String artist4;

    public Songs() {
    }

    public Songs( String playlistName,int songId, String song, String artist, int songId1, String song1, String artist1, int songId2, String song2, String artist2, int songId3, String song3, String artist3, int songId4, String song4, String artist4) {
        this.playlistName = playlistName;
        this.songId = songId;
        this.song = song;
        this.artist = artist;
        this.songId1 = songId1;
        this.song1 = song1;
        this.artist1 = artist1;
        this.songId2 = songId2;
        this.song2 = song2;
        this.artist2 = artist2;
        this.songId3 = songId3;
        this.song3 = song3;
        this.artist3 = artist3;
        this.songId4 = songId4;
        this.song4 = song4;
        this.artist4 = artist4;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongId1() {
        return songId1;
    }

    public void setSongId1(int songId1) {
        this.songId1 = songId1;
    }

    public String getSong1() {
        return song1;
    }

    public void setSong1(String song1) {
        this.song1 = song1;
    }

    public String getArtist1() {
        return artist1;
    }

    public void setArtist1(String artist1) {
        this.artist1 = artist1;
    }

    public int getSongId2() {
        return songId2;
    }

    public void setSongId2(int songId2) {
        this.songId2 = songId2;
    }

    public String getSong2() {
        return song2;
    }

    public void setSong2(String song2) {
        this.song2 = song2;
    }

    public String getArtist2() {
        return artist2;
    }

    public void setArtist2(String artist2) {
        this.artist2 = artist2;
    }

    public int getSongId3() {
        return songId3;
    }

    public void setSongId3(int songId3) {
        this.songId3 = songId3;
    }

    public String getSong3() {
        return song3;
    }

    public void setSong3(String song3) {
        this.song3 = song3;
    }

    public String getArtist3() {
        return artist3;
    }

    public void setArtist3(String artist3) {
        this.artist3 = artist3;
    }

    public int getSongId4() {
        return songId4;
    }

    public void setSongId4(int songId4) {
        this.songId4 = songId4;
    }

    public String getSong4() {
        return song4;
    }

    public void setSong4(String song4) {
        this.song4 = song4;
    }

    public String getArtist4() {
        return artist4;
    }

    public void setArtist4(String artist4) {
        this.artist4 = artist4;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "playlistName=" + playlistName +
                ", songId=" + songId +
                ", song='" + song + '\'' +
                ", artist='" + artist + '\'' +
                ", songId1=" + songId1 +
                ", song1='" + song1 + '\'' +
                ", artist1='" + artist1 + '\'' +
                ", songId2=" + songId2 +
                ", song2='" + song2 + '\'' +
                ", artist2='" + artist2 + '\'' +
                ", songId3=" + songId3 +
                ", song3='" + song3 + '\'' +
                ", artist3='" + artist3 + '\'' +
                ", songId4=" + songId4 +
                ", song4='" + song4 + '\'' +
                ", artist4='" + artist4 + '\'' +
                '}';
    }
}
