package com.epam.training.ht3.task1;

import java.util.Scanner;

public class Line01 {
    public static void main(String[] args) {

        int number = readIntegerValueFromConsole("Введите число: ");

        if (numberContainsEvenDigit(number)) {
            printResultMessage("В числе есть четная цифра.");
        } else {
            printResultMessage("В числе нет четных цифр.");
        }
    }

    public static void printResultMessage(String resultMessage) {
        System.out.println(resultMessage);
    }

    public static int readIntegerValueFromConsole(String messageForUser) {
        Scanner sc = new Scanner(System.in);
        int value = 0;

        System.out.print(messageForUser);
        if (sc.hasNextInt()) {
            value = sc.nextInt();
        }
        return value;
    }

    public static boolean numberContainsEvenDigit(int number) {
        int digit;
        boolean evenDigitIsPresent = false;
        while (number != 0) {
            digit = number % 10;
            number = number / 10;
            if (digit % 2 == 0) {
                evenDigitIsPresent = true;
            }
        }
        return evenDigitIsPresent;
    }
}