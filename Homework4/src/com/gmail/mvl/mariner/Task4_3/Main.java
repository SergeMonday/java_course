package com.gmail.mvl.mariner.Task4_3;
//Задание 4.3
// Используя цикл while, рассчитайте для введенного числа его факториал.
// Факториал числа n - это произведение всех натуральных чисел от 1 до n.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int fact=1;
        int i=1;

        do {
            i++;
            fact = fact*i;
        }
        while (i<n);

        System.out.println("Факториал числа = " + fact);
    }


}
