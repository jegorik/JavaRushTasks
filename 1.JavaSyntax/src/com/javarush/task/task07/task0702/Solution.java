package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] array =  new String[10];
        for (int i = 0; i < 8; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            array[i] = line;
        }
        for (int i = 9; i > -1; i--) {
            String res;
            System.out.println(array[i]);
        }
    }
}
