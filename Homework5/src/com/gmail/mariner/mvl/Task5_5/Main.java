package com.gmail.mariner.mvl.Task5_5;

//Задание 5.5
// Создать массив с целыми числовыми значения (с помощью Math.random() метода) .
// Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.

public class Main {

    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] massive = new int[10];
        int sum = 0;

        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int)(100 * Math.random());
            System.out.println(massive[i]);


            if (massive[i] > max) {
                max = massive[i];
            }

            if (massive[i] < min) {
                min = massive[i];
            }

            sum += massive[i];
        }

        for (int i = 0; i < massive.length; i++) {
            if ((massive[i] == max) || (massive[i] == min)) {
                sum -= massive[i];
            }
        }


        System.out.println();
        System.out.println("сумма элементов массива кроме МАХ и МИН = " + sum);
    }

    }
