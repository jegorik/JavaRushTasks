package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String t = reader.readLine();
            double number = Double.parseDouble(t);
            checkColor(number);
    }

    public static void checkColor(double num) {
        double result = (num % 5);
        if (result >=0 && result < 3){
            System.out.println("зелёный");
        } else if (result >= 3 && result < 4) {
            System.out.println("жёлтый");
        } else if (result >= 4 && result < 5) {
            System.out.println("красный");
        }
    }
}