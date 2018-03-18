package com.epam.training.ht3.task2;

import java.util.Scanner;

public class ConsoleReader {
    public static int readIntegerValueFromConsole(String messageForUser) {
        Scanner sc = new Scanner(System.in);
        int value;

        System.out.println(messageForUser);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(messageForUser);
        }
        value = sc.nextInt();
        return value;
    }
}
