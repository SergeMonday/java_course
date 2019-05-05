package com.gmail.mvl.mariner;
// Задани 18ю II-ый способ
// Найти в строке не только запятые, но и другие знаки препинания.
// Подсчитать общее их количество.

public class Main2 {
    public static void main(String[] args) {

        String str = "Текстовая. строка, с! несколькими, - : ,, символами;";
        int n = 0;
        char symbol;

        for (int i=0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',') {
                n++;
            } else if (symbol == '.') {
                n++;
            }
            else if (symbol == ';') {
                n++;
            }
            else if (symbol == ':') {
                n++;
            }
            else if (symbol == '!') {
                n++;
            }
            else if (symbol == '?') {
                n++;
            }
            else if (symbol == '-') {
                n++;
            }
            else if (symbol == '(') {
                n++;
            }
            else if (symbol == ')') {
                n++;
            }
            else if (symbol == '"') {
                n++;
            }

        }

        System.out.println("Количество символов= " + n);

    }
}
