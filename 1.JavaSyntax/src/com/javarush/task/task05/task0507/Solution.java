package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int count = 0;
        while (true) {
            String inputline = reader.readLine();
            double number = Double.parseDouble(inputline);
            if (number == -1) {
                System.out.println(sum/count);
                break;
            } else {
                sum = sum + number;
                count++;
            }
        }
    }
}

