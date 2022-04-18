package ru.skypro;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        delimiter();
        int year = 2000;
        isLeapYear(year);
        delimiter();

        int currentYear = ThreadLocalRandom.current().nextInt(1997, 2023);
        int clientOS = ThreadLocalRandom.current().nextInt(0, 2);
        whichAppShouldYouGet(clientOS, currentYear);
        delimiter();

        int deliveryDistance = ThreadLocalRandom.current().nextInt(1, 101);
        daysToWaitTillArrives(deliveryDistance);
        delimiter();

        String input = "abcdefghijk";
        noDublicatesInTheString(input);
        delimiter();

        int[] randomArray = new int[ThreadLocalRandom.current().nextInt(5, 10)];
        System.out.println("Произвольный массив: ");
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = ThreadLocalRandom.current().nextInt(0, 10);
            System.out.print(randomArray[i]);
            if (i < randomArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        turnOverTheArray(randomArray);
        System.out.println();
        delimiter();
    }

    // Задача 1

    public static void isLeapYear(int year) {
        boolean theYearIsLeapYear = year % 4 == 0 && year % 100 != 0;
        if (theYearIsLeapYear) {
            System.out.println(year + " год является високосным.");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    // Задача 2

    public static void whichAppShouldYouGet(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
    }

    // Задача 3

    public static void daysToWaitTillArrives(int distance) {
        boolean isNear = distance <= 20;
        boolean isNotThatFar = distance > 20 && distance <= 60;
        boolean isFarFarAway = distance > 60 && distance <= 100;
        if (isNear) {
            System.out.println("Потребуется дней: 1");
        } else if (isNotThatFar) {
            System.out.println("Потребуется дней: 2");
        } else if (isFarFarAway) {
            System.out.println("Потребуется дней: 3");
        }
    }

    // Задача 4

    public static void noDublicatesInTheString(String input) {
        String output = "";
        char[] chars = input.toCharArray();
        output += chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                System.out.println("Буква-дубликат: " + chars[i] + ".");
                break;
            } else {
                output = output + chars[i];
            }
            if (i == chars.length - 1) {
                System.out.println("Искомая строка без дублей: " + output);
            }
        }
    }

    // Задача 5

    public static void turnOverTheArray(int[] arr) {
        System.out.println("Массив в обратном порядке: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }

    public static void delimiter() {
        System.out.println("--------------------------------------------------------------");
    }


}
