package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First name here
        System.out.print("Please enter your name\n" +
                "First name: ");
        String firstName = scanner.nextLine();

        // Middle name
        System.out.print("Middle name: ");
        String middleName = scanner.nextLine();

        // Last name
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();

        // Suffix
        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();


        // trim and output full name
        firstName.trim(); middleName.trim(); lastName.trim(); suffix.trim();

        System.out.println("Full name: " +
                firstName + ' ' +
                (middleName.isBlank() ? "" : middleName + ' ') +
                lastName +
                (suffix.isBlank() ? "" : ", " + suffix));

    }
}