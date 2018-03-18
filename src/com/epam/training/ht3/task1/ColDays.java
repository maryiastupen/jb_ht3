package com.epam.training.ht3.task1;

import java.util.Scanner;

public class ColDays {

    public static void main(String[] args) {
        int col_day;
        int year;
        int month;

        year = readIntegerValueFromConsole("Введите год: ");
        month = readIntegerValueFromConsole("Введите месяц: ");
        col_day = findNumberOfDays(year, month);
        printResult(col_day);
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

    public static void printResult(int col_day) {
        System.out.println("Количество дней равно - " + col_day);
    }

    public static int findNumberOfDays(int year, int month) {

        int col_day = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                col_day = 31;
                break;
            case 2:
                if (year % 4 == 0) {
                    col_day = 29;
                } else {
                    col_day = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                col_day = 30;
                break;
        }
        return col_day;
    }
}
