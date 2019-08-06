package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int lineinput = Integer.parseInt(line);
        checkNumber(lineinput);
    }
    public static void checkNumber(int number){
        if (number != 0) {
            boolean pos = number > 0;
            double ret = ((int) (number / 2d)) - (number / 2d);
            boolean even = ret == 0;

            if (pos & even) {
                System.out.println("положительное четное число");
            } else if (!pos & even) {
                System.out.println("отрицательное четное число");
            } else if (pos & !even) {
                System.out.println("положительное нечетное число");
            } else if (!pos & !even) {
                System.out.println("отрицательное нечетное число");
            }
        } else {
            System.out.println("ноль");
        }
    }
}


