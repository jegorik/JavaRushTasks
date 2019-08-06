package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String line2 = reader.readLine();
        int x = Integer.parseInt(line);
        int y = Integer.parseInt(line2);
        compare(x,y);
    }
    public static void compare(int x, int y) {
        if (x < y) {
            System.out.println(x);
        } else if (y < x){
            System.out.println(y);
        } else {
            System.out.println(x);
        }
    }
}