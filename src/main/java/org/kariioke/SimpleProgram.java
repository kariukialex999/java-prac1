package org.kariioke;

public class SimpleProgram {
    static void main() {
        int augustSize = 31;
        int daysOutCount = 0;

        for (int day = 1; day < augustSize; day++) {
            if (day % 2 == 0) {
                daysOutCount ++;
            }
        }

        System.out.println("Kunal can go out for " + daysOutCount + " days.");
    }
}
