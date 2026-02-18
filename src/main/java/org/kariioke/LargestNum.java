package org.kariioke;

import java.util.Scanner;

public class LargestNum {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = scanner.nextInt();

        if (firstNum > secondNum) {
            System.out.println(firstNum + " is the largest number");
        } else System.out.println(secondNum + " is the largest number");
    }
}
