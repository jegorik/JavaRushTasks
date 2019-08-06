package com.javarush.task.task05.task0530;

import java.io.*;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = reader.readLine();
        int a = Integer.parseInt(line1);
        String line2 = reader.readLine();
        int b = Integer.parseInt(line2);
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}