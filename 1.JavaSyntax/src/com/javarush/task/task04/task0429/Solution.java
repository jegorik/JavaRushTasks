package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[3];
        int countpos = 0;
        int countneg = 0;
        for (int i = 0; i < 3; i++) {
            String line = reader.readLine();
            int number = Integer.parseInt(line);
            numbers[i] = number;
            if (numbers[i] > 0) {
                countpos++;
            } else if (numbers[i] < 0) {
                countneg++;
            }
        }
        System.out.println("количество отрицательных чисел: "+ countneg);
        System.out.println("количество положительных чисел: "+ countpos);
    }
}