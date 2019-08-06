package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> chars = new ArrayList<Character>();
        ArrayList<Character> symbols = new ArrayList<Character>();
        char[] line = (reader.readLine().toCharArray());
        for (char x : line) {
            if (isVowel(x)) {
                chars.add(x);
            } else if (!isVowel(x) & x != ' '){
                symbols.add(x);
            }
        }
        for (char value : chars) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (char value : symbols) {
            System.out.print(value + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}