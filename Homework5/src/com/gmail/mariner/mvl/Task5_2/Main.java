package com.gmail.mariner.mvl.Task5_2;

//Задание 5.2
// Введите с клавиатуры любое число, следует подсчитать сумму всех цифр данного числа и вывести результат на экран.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите число: ");

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        int sum = 0;

        char[] array = num.toCharArray();

        for (int i = 0; i < array.length; ++i) {

            int charInt = Integer.parseInt(Character.toString(array[i]));
            sum += charInt;

        }
        System.out.println("Сумма цифр числа = " + sum); //вывод суммы числа
    }

}