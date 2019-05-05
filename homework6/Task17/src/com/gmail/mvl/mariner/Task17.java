package com.gmail.mvl.mariner;
//Задание 17.
// Создать двухмерный квадратный массив, и заполнить его "бабочкой".

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {

        System.out.println("Квадратный массив. Введите число а: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int[][] m = new int[a][a];
        int n = (m.length - 1);

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {

                if (i <= j && (i <= n - j) || (i >= n - j) && i >= j)
                {
                    m[i][j] = 1;
                }
                else
                {
                    m[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < a; i++, System.out.println()) {
            for (int j = 0; j < a; j++) {
                System.out.print(m[i][j]+" ");
            }
        }
    }
}
