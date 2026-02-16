package org.kariioke;

import java.util.Scanner;

public class NumberCommonFactor {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter two numbers: ");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int hcm = firstNum * secondNum;
        int lcm = 1;
        System.out.println("The Highest common factor is: " + hcm);
        System.out.println("The Lowest common factor is " + lcm);
    }
}
