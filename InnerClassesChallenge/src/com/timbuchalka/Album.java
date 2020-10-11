package com.timbuchalka;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by dev on 18/09/15.
 */
public class Album {
    private String name;
    private String artist;
    //private ArrayList<Song> songs;
    private SongList songs;

    private class SongList {
        private ArrayList<Song> songArrayList;

        public SongList() {
            this.songArrayList = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if(songArrayList.contains(song)) {
                return false;
            } else {
                songArrayList.add(song);
                return true;
            }
        }
        private Song findSong(String title) {
            for(Song checkedSong: this.songArrayList) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
         return songs.add(new Song(title,duration));
    }



    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber -1;
        if((index >=0) && (index < this.songs.songArrayList.size())) {
            playList.add(this.songs.songArrayList.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = songs.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }



















}
