package org.kariioke;

import java.util.Scanner;

public class MultiplicationX {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and i will give you it's multiplication table");
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int product = i * number;
            System.out.println(i + " X " + number + " = " + product);
        }
    }
}
