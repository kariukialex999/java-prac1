package org.kariioke;

import java.util.Scanner;

public class SimpleInterest {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principle (P): ");
        double principle = scanner.nextDouble();
        System.out.print("Enter rate (R) per annum: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time (T) in years: ");
        double time = scanner.nextDouble();

        double simpleInterest = principle * rate * time;
        simpleInterest /= 100;

        System.out.println("Your simple interest: " + simpleInterest);
        double totalAmount = principle + simpleInterest;

        System.out.println("The total amount is: " + totalAmount);
    }
}
