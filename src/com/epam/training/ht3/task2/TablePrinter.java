package com.epam.training.ht3.task2;

public class TablePrinter {

    public static void printTable(int segmentStart, int segmentEnd, int step, Function function) {
        System.out.println("Argument's value\tFunction's value");

        for (int argument = segmentStart; argument < segmentEnd + 1; argument = argument + step) {
            System.out.println(argument + "\t\t\t\t\t" + function.getCalculatedValue(argument));
        }
    }

}
