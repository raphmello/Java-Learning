package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800,5,100);
        System.out.println("Your final score = " + highScore);

        highScore = calculateScore(true,10000,8,200);
        System.out.println("Your final score = " + highScore);
        String playerName = "Raphael";
        int position = calculatedHighScorePosition(1500);
        displayHighScorePosition(playerName,position);
        position = calculatedHighScorePosition(900);
        displayHighScorePosition(playerName,position);
        position = calculatedHighScorePosition(400);
        displayHighScorePosition(playerName,position);
        position = calculatedHighScorePosition(50);
        displayHighScorePosition(playerName,position);

    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playersName,int position){
        System.out.println(playersName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculatedHighScorePosition(int playerScore){
//        if (playerScore>=1000) {
//            return 1;
//        }else if (playerScore >= 500) {
//            return 2;
//        }else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000){
            position = 1;
        }else if(playerScore >= 500){
            position = 2;
        }else if (playerScore >= 100); {
            position = 3;
        }
        return position;
    }
}
