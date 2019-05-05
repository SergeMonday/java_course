package com.gmail.mvl.mariner.Task4_2;
//Имеются два дома размерами a на b и c на d.
//Имеется участок размерами e на f. Проверить помещаются ли эти дома на данном участке.
//Стороны домов — параллельны сторонам участка, в остальном размещение может быть любым.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сторону а первого дома : ");
        int a = scanner.nextInt();
        System.out.println("Введите сторону b первого дома : ");
        int b = scanner.nextInt();

        System.out.println("Введите сторону c второго дома : ");
        int c = scanner.nextInt();
        System.out.println("Введите сторону d второго дома : ");
        int d = scanner.nextInt();

        System.out.println("Введите сторону e участка : ");
        int e = scanner.nextInt();
        System.out.println("Введите сторону f участка : ");
        int f = scanner.nextInt();

        int l1 = Math.max(a,b);  //длина первого дома
        int l2 = Math.max(c,d);  //длина второго дома
        int w1 = Math.min(a,b);  //ширина первого дома
        int w2 = Math.min(c,d);  //ширина второго дома
        int l3 = Math.max(e,f);  //длина участка
        int w3 = Math.min(e,f);  //ширина участка

        if (((w1 + w2) <= w3) && (Math.max(l1, l2) <= l3)) {
            System.out.println("Дома впишутся в участок");
        } else if (((l1 + l2) <= l3) && (Math.max(w2, w3) <= w3)) {
            System.out.println("Дома впишутся в участок");
        } else if (((l1 + w2) <= l3) && (l2 <= w3)) {
            System.out.println("Дома впишутся в участок");
        } else if (((l2 + w1) <= l3) && (l1 <= w3)) {
            System.out.println("Дома впишутся в участок");
        } else {
            System.out.println("Дома не впишутся в участок");
        }

    }

}