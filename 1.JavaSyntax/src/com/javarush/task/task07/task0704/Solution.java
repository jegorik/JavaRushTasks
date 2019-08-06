package com.javarush.task.task07.task0704;



import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int line = Integer.parseInt(reader.readLine());
            array1[i] = line;
        }
        for (int i = 9; i > -1 ; i--) {
            System.out.println(array1[i]);
        }
    }
}

