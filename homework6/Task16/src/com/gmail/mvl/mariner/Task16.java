package com.gmail.mvl.mariner;
//Задание 16.
// Создать массив. Заполнить его случайными элементами, распечатать,перевернуть, и снова распечатать.
// Нежелательно создавать ещёодин массив при переворачивании.

import java.util.Random;

public class Task16 {
    public static void main(String[] args) {

        int[] massive = new int[11];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = (new Random().nextInt(100));
            System.out.print(massive[i] + " ");
        }

        int n = massive.length;
        int temp;

        for (int i = 0; i < n/2; i++) {

            temp = massive[n-i-1];
            massive[n-i-1] = massive[i];
            massive[i] = temp;
        }
        System.out.println();

        for (int i=0; i<massive.length; i++){
            System.out.print(massive[i] + " ");
        }
    }
}