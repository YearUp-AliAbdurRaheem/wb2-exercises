package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] name = askForString("Please enter your name: ").split("\\s+");

        System.out.printf("""
                First name:\s%s
                Middle name:\s%s
                Last name:\s%s""",
                name[0],
                (name.length > 2) ? name[1] : "(none)",
                (name.length > 2) ? name[2] : name[1]);

    }

    static String askForString(String question) {
        System.out.print(question);
        return scanner.nextLine().trim();
    }
}
