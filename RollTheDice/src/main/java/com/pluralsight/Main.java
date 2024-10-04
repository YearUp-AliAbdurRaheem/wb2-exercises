package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Vars and dice
        Dice dice = new Dice();
        int roll1, roll2;
        int twos = 0, fours = 0, sixes = 0, sevens = 0;

        // Loop to roll the dice 100x
        for (int i = 1; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2; // add rolls

            // roll result
            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

            // Increment found number
            twos += (sum == 2) ? 1 : 0;
            fours += (sum == 4) ? 1 : 0;
            sixes += (sum == 6) ? 1 : 0;
            sevens += (sum == 7) ? 1 : 0;

        }

        // Display the final counters
        System.out.printf("""
    \nResults:
    Number of times 2 was rolled: %d
    Number of times 4 was rolled: %d
    Number of times 6 was rolled: %d
    Number of times 7 was rolled: %d""", twos, fours, sixes, sevens);
    }
}