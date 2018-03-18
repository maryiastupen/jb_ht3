package com.epam.training.ht3.task1;

import java.util.Scanner;

public class MinMaxString {

    public static void main(String[] args) {
        String max = "";
        String min = "";

        int n = 10;

        for (int i = 0; i < n; i++) {
            String str = readStringFromConsole();

            if (i == 0) {
                min = defineMinWhenFirst(min, str);
            }
            max = defineMaxString(max, str);
            min = defineMinString(min, str);
        }
        printResult(max, min);
    }

    private static String defineMinWhenFirst(String min, String str) {
        min = str;
        return min;
    }


    public static String readStringFromConsole() {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.print("> ");
        if (sc.hasNextLine()) {
            str = sc.nextLine();
        }
        return str;
    }

    public static void printResult(String max, String min) {
        System.out.println("max string = " + max + " length=" + max.length());
        System.out.println("min string = " + min + " length=" + min.length());
    }

    public static String defineMaxString(String latestMax, String str) {
        if (str.length() > latestMax.length()) {
            latestMax = str;
        }
        return latestMax;
    }

    public static String defineMinString(String latestMin, String str) {
        if (str.length() < latestMin.length()) {
            latestMin = str;
        }
        return latestMin;
    }

}
