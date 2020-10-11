package com.company;

public class Main {

    public static void main(String[] args) {
       int newScore = calculateScore("Raphael",10);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(13.6);
        System.out.println(centimeters);
        centimeters = calcFeetAndInchesToCentimeters(1,1);
        System.out.println(centimeters);
    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore (int score) {
        System.out.println("Unamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore () {
        System.out.println("No player and no score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))){
            return -1;
        }

        double totalInches = feet * 12 + inches;
        return totalInches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches < 0){
            return -1;
        }

        double feet = Math.floor(inches / 12);
        double correctedInches = Math.floor(inches % 12);
        return calcFeetAndInchesToCentimeters(feet,correctedInches);
    }
}
