package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        double number = Double.parseDouble(line);
        checkNumber(number);
    }

    public static void checkNumber(double num) {
        int x = 366;
        int y = 365;
        double checkNum1 = num / 400;
        double checkNum2 = num / 100;
        double checkNum3 = num / 4;
        int res1 = (int)checkNum1;
        int res2 = (int)checkNum2;
        int res3 = (int)checkNum3;
        double check1 = checkNum1 - res1;
        double check2 = checkNum2 - res2;
        double check3 = checkNum3 - res3;
        if (check1 == 0) {
            System.out.println("количество дней в году: " + x);
        } else if (check1 != 0 && check2 != 0 && check3 == 0) {
            System.out.println("количество дней в году: " + x);
        } else {
            System.out.println("количество дней в году: " + y);
        }
    }
}