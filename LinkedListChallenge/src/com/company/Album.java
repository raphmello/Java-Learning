package com.company;

import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Song> songArrayList;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songArrayList = new ArrayList<>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getSongArrayList() {
        return songArrayList;
    }

    public void addSongArrayList(Song newSong) {
        if(!findSong(newSong.getSongName())) {
            this.songArrayList.add(newSong);
        } else {
            System.out.println("Song already added to album");
        }
    }

    private boolean findSong(String songName) {
        Song searchName = new Song(songName,0);
        for(int i = 0;i < songArrayList.size();i++) {
            if (songArrayList.get(i).getSongName().equals(songName)) {
                return true;
            }
        }
        return false;
    }
}
