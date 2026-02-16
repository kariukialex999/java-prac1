package org.kariioke;

import java.util.Scanner;

public class LeapYear {
    //program to check for leap year

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your birthyear YYYY: ");
        int year = scanner.nextInt();

            if (year % 4 == 0) {
                System.out.println(year + " is a leap year");
            }else System.out.println(year + " is not a leap year");
    }


}
