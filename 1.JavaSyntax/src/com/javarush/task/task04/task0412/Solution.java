package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int a = Integer.parseInt(n);
        if (a >= 1) {
            a = a * 2;
            System.out.println(a);
        } else if ( a < 0) {
           a = a + 1;
            System.out.println(a);
        } else {
            System.out.println(a);
        }


    }

}