package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String [] array1 = new String[10];
        int [] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            array1[i] = line;
            array2[i] = array1[i].length();
        }
        for (int i = 0; i < 10 ; i++) {
            System.out.println(array2[i]);
        }
    }
}
