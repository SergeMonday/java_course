package com.gmail.mvl.mariner;
//Задание 19
// Подсчитать колиество слов в тексте
// Слова могут разделяться несколькими пробелами.
// Могут быть пробелы в начале и в конце текста.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        
        int border = 0; //количество всех символов, кроме буквенных и численных
        String text = "  Тестовый текст   для задачи ! ";

        Pattern pattern = Pattern.compile("\\b"); //находит границы слов.

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            border++;
        }

        System.out.println(border/2); //границ слов вдвое меньше самих слов
    }

}
