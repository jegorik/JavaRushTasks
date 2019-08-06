package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        while (true)
        {
            String inputline = buffer.readLine();
            if (inputline.equals("сумма")) {
                System.out.println(sum);
                break;
            }
                else {
                double number = Double.parseDouble(inputline);
                    sum = sum + number;
            }
        }
    }
}
