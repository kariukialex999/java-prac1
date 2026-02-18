package org.kariioke;

import java.util.Scanner;

public class NumberCommonFactor {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter two numbers: ");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int gcd = gcd(firstNum, secondNum);
        int lcm = firstNum * secondNum;
        lcm /= gcd;

        System.out.println("The Greatest Common Divisor: " + gcd);
        System.out.println("The Lowest common factor is " + lcm);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
