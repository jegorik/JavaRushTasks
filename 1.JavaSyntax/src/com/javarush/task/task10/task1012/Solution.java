package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        String letters = "";
        ArrayList<Character> checkArray = new ArrayList<Character>();

        for (int i = 0; i < list.size(); i++) {
            letters = letters + list.get(i);
        }

        for (char x: letters.toCharArray()){
            checkArray.add(x);
        }

        for (char x : alphabet) {
            char letter = x;
            int freq = Collections.frequency(checkArray, x);
            System.out.println(Character.toString(letter) + " " + freq);
        }
    }
}
