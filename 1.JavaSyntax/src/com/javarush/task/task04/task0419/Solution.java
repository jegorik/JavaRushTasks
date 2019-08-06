package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String line2 = reader.readLine();
        String line3 = reader.readLine();
        String line4 = reader.readLine();
        int x = Integer.parseInt(line);
        int y = Integer.parseInt(line2);
        int z = Integer.parseInt(line3);
        int e = Integer.parseInt(line4);
        compare(x,y,z,e);
    }
    public static void compare(int x, int y, int z, int e) {
        int big1 = Math.max(x,y);
        int big2 = Math.max(z,e);
        System.out.println(Math.max(big1,big2));
    }
}
