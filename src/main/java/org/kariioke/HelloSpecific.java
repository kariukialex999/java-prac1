package org.kariioke;

import java.util.Scanner;

public class HelloSpecific {
    static void main() {
        //prompts user's name and greets user

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.println("Hello " + name + "!");
    }


}
