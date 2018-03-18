package com.epam.training.ht3.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x = readDoubleValueFromConsole("Please, enter your value: ");
        double result;
        try {
            result = calculateFunctionValue(x);
            printResult(result);
        } catch (OutOfCalculatedIntervalException ex) {
            System.out.println(ex.message);
        }
    }

    public static void printResult(double result) {
        System.out.println("The result of function calculation is: " + result);
    }

    public static double readDoubleValueFromConsole(String messageForUser) {
        Scanner sc = new Scanner(System.in);
        double value = 0;

        System.out.print(messageForUser);
        if (sc.hasNextDouble()) {
            value = sc.nextDouble();
        }
        return value;
    }

    public static double calculateFunctionValue(double x) throws OutOfCalculatedIntervalException {

        double functionValue;
        int segmentBeginning = -3;
        int segmentEnding = 3;

        if (x <= segmentBeginning) {
            functionValue = 9;
        } else if (x > segmentEnding) {
            functionValue = 1 / (Math.pow(x, 2) + 1);
        } else {
            throw new OutOfCalculatedIntervalException("Sorry, your input value is out of the calculated interval.");
        }
        return functionValue;
    }
}
