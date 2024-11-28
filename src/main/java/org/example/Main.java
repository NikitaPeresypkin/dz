package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task(1);
        printThreeWords();

        task(2);
        checkSumSign();

        task(3);
        printColor();

        task(4);
        compareNumbers();

        task(5);
        System.out.println(task5(5, 7));//задание 5 вывод результата метода в консоль

        task(6);
        task6(600);

        task(7);
        System.out.println(task7(-15));//задание 7 вывод результата метода в консоль

        task(8);
        task8("Я два раза повторять не буду!", 2);

        task(9);
        System.out.println(task9(2007));//задание 9 вывод результата метода в консоль

        task(10);
        int[] arr10 = new int[]{1, 0, 0, 1, 1, 1, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr10));
        for (var n = 0; n < arr10.length; n++) {
            if (arr10[n] == 0) arr10[n] = 1;
            else if (arr10[n] == 1) arr10[n] = 0;
        }
        System.out.println(Arrays.toString(arr10));


        task(11);
        int[] arr11 = new int[100];
        for (var i = 0; i < arr11.length; i++) {
            arr11[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr11));


        task(12);
        int[] arr12 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr12));
        for (var i = 0; i < arr12.length; i++) {
            if (arr12[i] < 6) arr12[i] = arr12[i] * 2;
        }
        System.out.println(Arrays.toString(arr12));

        task(13);
        int[][] arr13 = new int[7][7];
        for (int i = 0; i < arr13.length; i++) {
            int p = arr13.length - 1 - i;
            arr13[i][i] = 1;
            arr13[p][i] = 1;
        }
        Arrays.stream(arr13).map(Arrays::toString).forEach(System.out::println);

        task(14);
        System.out.println(Arrays.toString(task14(5, 8)));


    }

    public static void task(int numb) { //вывод в консоль номера задения
        System.out.println("----------------------\nзадание " + numb + "\n");
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -1;
        int b = 1;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 333;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зелёный");
        } else {
            System.out.println("Жёлтый");
        }
    }

    public static void compareNumbers() {
        int a = 63;
        int b = 12;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean task5(int one, int two) {
        return 10 <= (one + two) && (one + two) <= 20;
    }

    public static void task6(int s) {
        String sign;
        if (s < 0) sign = "Отрицательное";
        else sign = "Положительное";
        System.out.println(sign);

    }

    public static boolean task7(int s) {
        return s < 0;


    }

    public static void task8(String text, int q) {
        for (var i = 0; i < q; i++) {
            System.out.println(text);
        }
    }

    public static boolean task9(int y) {
        ;
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;  //каждый четвёртый и никогда не сотый или каждый четырёхсотый
    }

    public static int[] task14(int len, int initialValue) {
        int[] arr14 = new int[len];
        for (var i = 0; i < arr14.length; i++) {
            arr14[i] = initialValue;
        }

        return arr14;
    }
}



