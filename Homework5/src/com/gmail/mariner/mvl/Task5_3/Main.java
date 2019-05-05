package com.gmail.mariner.mvl.Task5_3;

//Задание 5.3
// Имеется целое число, введенное в клавиатуры, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int n = scanner.nextInt();

        int i = 2;
        int j = 0;

        while ((i*i <= n) && (j != 1)) {

            if (n%i == 0){
                j = 1;
                i++;
            } else {
                i++;
            }

        }

        if (j == 1) {
            System.out.println("Число составное.");
        } else {
            System.out.println("Число простое. Успех!");
        }

        }

    }

