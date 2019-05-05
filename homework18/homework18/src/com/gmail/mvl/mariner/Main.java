package com.gmail.mvl.mariner;
// Задани 18ю I-ый способ
// Найти в строке не только запятые, но и другие знаки препинания.
// Подсчитать общее их количество.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        int s = 0; //количество всех символов, кроме буквенных и численных
        int p = 0; //
        String text = "tekstowaya. stroka, c! neskolkimi, - : ,, simvolami;";

        Pattern findsymbol = Pattern.compile("\\W");

        Matcher matcher1 = findsymbol.matcher(text);
        while (matcher1.find()) {
            s++;
        }

        Pattern probel = Pattern.compile("\\s");

        Matcher matcher2 = probel.matcher(text);
        while (matcher2.find()) {
            p++;
        }


        System.out.println("Колличество знаков препинания в тексте = " + (s-p));
    }

}
