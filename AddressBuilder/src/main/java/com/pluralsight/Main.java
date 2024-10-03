package com.pluralsight;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Full name: "); String fullName = scanner.nextLine();

        System.out.print("Billing Street: "); String billingStreet =  scanner.nextLine();
        System.out.print("Billing City: "); String billingCity =  scanner.nextLine();
        System.out.print("Billing State: "); String billingState =  scanner.nextLine();
        System.out.print("Billing Zip: "); String billingZip =  scanner.nextLine();

        System.out.print("Shipping Street: "); String shippingStreet =  scanner.nextLine();
        System.out.print("Shipping City: "); String shippingCity =  scanner.nextLine();
        System.out.print("Shipping State: "); String shippingState =  scanner.nextLine();
        System.out.print("Shipping Zip: "); String shippingZip =  scanner.nextLine();

        StringBuilder billingAddress = new StringBuilder();
        billingAddress.append(billingStreet).append("\n")
                .append(billingCity).append(", ")
                .append(billingState).append(" ")
                .append(billingZip);

        StringBuilder shippingAddress = new StringBuilder();
        shippingAddress.append(shippingStreet).append("\n")
                .append(shippingCity).append(", ")
                .append(shippingState).append(" ")
                .append(shippingZip);

        // Display the information
        System.out.println('\n' + fullName + '\n');
        System.out.println("Billing Address:");
        System.out.println(billingAddress.toString() + '\n');
        System.out.println("Shipping Address:");
        System.out.println(shippingAddress.toString());

    }
}