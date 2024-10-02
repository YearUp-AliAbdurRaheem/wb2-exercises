package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // First name here
        String firstName = askForString("Please enter your name\n" + "First name: ");

        // Middle name
        String middleName = askForString("Middle name: ");

        // Last name
        String lastName = askForString("Last name: ");

        // Suffix
        String suffix = askForString("Suffix: ");


        // trim and output full name

        System.out.println("Full name: " +
                firstName + ' ' +
                (middleName.isBlank() ? "" : middleName + ' ') +
                lastName +
                (suffix.isBlank() ? "" : ", " + suffix));

    }

    static String askForString(String question) {
        System.out.print(question);
        return scanner.nextLine().trim();
    }
}