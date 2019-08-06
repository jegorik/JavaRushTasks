package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[3];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            String line = reader.readLine();
            int number = Integer.parseInt(line);
            numbers[i] = number;
            if (numbers[i] > 0) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println(count);
        } else {
            System.out.println(count);
        }
    }
}