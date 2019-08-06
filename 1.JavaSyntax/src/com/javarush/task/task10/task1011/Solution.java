package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] charArray = s.toCharArray();
        for (int i = 0; i < 40; i++) {
            char[] copy = Arrays.copyOfRange(charArray, i, charArray.length);
            System.out.println(new String(copy));
        }
    }
}

