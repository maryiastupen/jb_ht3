package com.epam.training.ht3.task2;


public class Main {

    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();
        int segmentStart = consoleReader.readIntegerValueFromConsole("Please, enter the beginning of a segment:");
        int segmentEnd = consoleReader.readIntegerValueFromConsole("Please, enter the end of a segment:");
        int step = consoleReader.readIntegerValueFromConsole("Please, enter the step:");

        TablePrinter.printTable(segmentStart, segmentEnd, step, new Function());
    }
}
