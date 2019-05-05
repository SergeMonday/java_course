package com.gmail.mariner.mvl.Task5_4;

//Задание 5.4
//
// Имеется целое число, следует вывести его в бухгалтерском формате.
// Т.е. начиная справа каждые три позиции отделяются пробелом.
// Например, число 20023143 должно быть выведено как 20 023 143.
// (Не использовать классы и методы форматирования чисел из JDK!)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Введите число: ");

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        char[] array = num.toCharArray();

        for (int i = array.length -1; i >= 0; --i)

            System.out.print(array[i]);

    }

}
