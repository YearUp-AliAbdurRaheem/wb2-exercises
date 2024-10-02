package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] gameScore = askForString("Please enter a game score: ").split("[:|]");

        // Handles a tie by saying the winner is Tie!
        String winner = (Integer.valueOf(gameScore[2]) == Integer.valueOf(gameScore[3]) ?
                "Tie!" : (Integer.valueOf(gameScore[2]) > Integer.valueOf(gameScore[3]) ?
                gameScore[0] : gameScore[1]));

        System.out.println("Winner: " + winner);
    }
    static String askForString(String question) {
        System.out.print(question);
        return scanner.nextLine().trim();
    }
}