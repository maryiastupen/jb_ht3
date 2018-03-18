package com.epam.training.ht3.task1;

import java.util.Scanner;

public class LastDigit {

    public static void main(String[] args) {
        int number;
        int poslZifra;
        int poslZifraKv;

        number = readNumberFromConsole();
        poslZifra = calculateModulo(number);
        poslZifraKv = definePoslZifraKv(poslZifra);
        printResult(number, poslZifraKv);
    }

    public static int calculateModulo(int number) {
        return number % 10;
    }

    public static int readNumberFromConsole() {
        int number = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        }
        return number;
    }

    public static int definePoslZifraKv(int poslZifra) {
        int poslZifraKv;
        switch (poslZifra) {
            case 0:
                poslZifraKv = 0;
                break;
            case 1:
                poslZifraKv = 1;
                break;
            case 2:
                poslZifraKv = 4;
                break;
            case 3:
                poslZifraKv = 9;
                break;
            case 4:
                poslZifraKv = 6;
                break;
            case 5:
                poslZifraKv = 5;
                break;
            case 6:
                poslZifraKv = 6;
                break;
            case 7:
                poslZifraKv = 9;
                break;
            case 8:
                poslZifraKv = 4;
                break;
            case 9:
                poslZifraKv = 1;
                break;
            default:
                throw new RuntimeException("Что-то не то с программой.");
        }
        return poslZifraKv;
    }

    public static void printResult(int number, int poslZifraKv) {
        System.out.println("Последняя цифра квадрата числа " + number + " равняется " + poslZifraKv);
    }
}