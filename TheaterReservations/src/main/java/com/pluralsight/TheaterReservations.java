package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Asking user for info
        String[] name = askForString("Please enter your name: ").split("\\s+");
        String date = askForString("What date will you be coming (MM/dd/yyyy): ");
        String ticketCount = askForString("How many tickets would you like? ");

        // Parsing Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate reservation = LocalDate.parse(date, formatter);

        // Outputting reservation receipt
        System.out.println(ticketCount + " ticket" + ((Integer.valueOf(ticketCount) > 1) ? 's' : "") +
                " reserved for " + reservation +
                " under " + name[1] + ", " + name[0]);
    }
    static String askForString(String question) {
        System.out.print(question);
        return scanner.nextLine().trim();
    }
}