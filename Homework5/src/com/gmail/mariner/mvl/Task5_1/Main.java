package com.gmail.mariner.mvl.Task5_1;
//Задание 5.1
//
// Имеется последовательность (массив) случайных чисел (ее можно генерировать с помощью Math.random() метода),
// найти и вывести наибольшее из них.

public class Main {

    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int[] massive = new int[10];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int)(10000 * Math.random());
            System.out.println(massive[i]);

            if (massive[i] > max) {
                max = massive[i];
            }
        }
        System.out.println();
        System.out.println("Максимальное число в массиве= " + max);
    }


}