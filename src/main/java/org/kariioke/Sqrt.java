package org.kariioke;

import java.util.Scanner;

public class Sqrt {
    static void main() {
        //return the square root to the nearest integer

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your number: ");
        double num = scanner.nextInt();

        double sqrt = Math.sqrt(num);
        int ans = (int)sqrt;
        System.out.println("The square root of your number is " + ans + " to the nearest integer");
    }
}
