package org.kariioke;

import java.util.Scanner;

public class EvenOdd {

    //program that takes a number from the user and prints whether it's odd or even
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        }else System.out.println(number + " is odd.");
    }
}
