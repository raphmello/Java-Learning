package com.company;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static LinkedList<Song> playlist = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static boolean forward = true;

    public static void main(String[] args) {


        Album album1 = new Album("A");
        Album album2 = new Album("B");

        album1.addSongArrayList(new Song("1.1", 3));
        album1.addSongArrayList(new Song("1.2", 2));
        album1.addSongArrayList(new Song("1.3", 4));
        album2.addSongArrayList(new Song("2.1", 5));
        album2.addSongArrayList(new Song("2.1", 5));

        playlist.add(album1.getSongArrayList().get(0));
        playlist.add(album2.getSongArrayList().get(0));
        playlist.add(album1.getSongArrayList().get(2));

        ListIterator<Song> songIterator = playlist.listIterator();


        boolean quit = false;
        instructions();

        skipForward(songIterator);


        while (!quit) {
            System.out.print("Enter the option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    quit = true;
                    break;
                case 2:
                    skipForward(songIterator);
                    break;
                case 3:
                    skipBackwards(songIterator);
                    break;
                case 4:
                    replaySong(songIterator);
                    break;
                case 5:
                    printPlaylist();
                    break;
                case 6:
                    removeCurrentSong(songIterator);
                    break;
            }

        }

    }

    public static void instructions() {
        System.out.println("Select the option:\n" +
                "1. Quit\n" +
                "2. Skip Forward\n" +
                "3. Skip Backwards\n" +
                "4. Replay\n" +
                "5. List of songs in the playlist\n" +
                "6. Remove current song");
    }

    public static void addToPlaylist(Song newSong) {
        playlist.add(newSong);

    }

    public static void removeCurrentSong(ListIterator<Song> songListIterator) {
        if(playlist.size()>0) {
            songListIterator.remove();
            if(songListIterator.hasNext()) {
                Song currentSong = (Song) songListIterator.next();
                System.out.println("Now playing " + currentSong.getSongName());
            } else if (songListIterator.hasPrevious()) {
                Song currentSong = (Song) songListIterator.previous();
                System.out.println("Now playing " + currentSong.getSongName());
            }
        }
    }

    public static void skipForward(ListIterator<Song> songIterator) {
        if (!forward) {
            if (songIterator.hasNext()) {
                songIterator.next();
            }
            forward = true;
        }
        if (songIterator.hasNext()) {
            Song currentSong = (Song) songIterator.next();
            System.out.println("Now playing " + currentSong.getSongName());
            forward = true;
        } else {
            System.out.println("End of playlist");
            forward = false;
        }


    }

    public static void skipBackwards(ListIterator<Song> songIterator) {
        if (forward) {
            if (songIterator.hasPrevious()) {
                songIterator.previous();
            }
            forward = true;
        }
        if (songIterator.hasPrevious()) {
            Song currentSong = (Song) songIterator.previous();
            System.out.println("Now playing " + currentSong.getSongName());
            forward = false;
        } else {
            System.out.println("Start of Playlist");
            forward = true;
        }
    }

    public static void replaySong(ListIterator<Song> songIterator) {
        if (forward && songIterator.hasPrevious()) {
            System.out.println("Now playing " + songIterator.previous().getSongName());
            forward = false;
        } else if (!forward && songIterator.hasNext()) {
            System.out.println("Now playing " + songIterator.next().getSongName());
            forward = true;
        }
    }

    public static void printPlaylist() {
        ListIterator<Song> iterator = playlist.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getSongName());
        }
    }
}

