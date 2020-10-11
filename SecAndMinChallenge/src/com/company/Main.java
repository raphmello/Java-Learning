package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        String duration = getDurationString(60,30);
        String duration2 = getDurationString(3630);
        System.out.println(duration + " " + duration2);
    }

    public static String getDurationString (int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        } else {
            int hour = minutes / 60;
            int min = minutes % 60;
            return hour + "h " + min + "m " + seconds + "s";
        }
    }

    public static String getDurationString (int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        } else {
            int minutes = seconds / 60;
            int sec = seconds % 60;
            return getDurationString(minutes,sec);
        }
    }
}
