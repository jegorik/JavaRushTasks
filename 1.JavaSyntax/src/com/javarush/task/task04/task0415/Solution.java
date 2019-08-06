package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = reader.readLine();
        String line2 = reader.readLine();
        String line3 = reader.readLine();
        int x = Integer.parseInt(line1);
        int y = Integer.parseInt(line2);
        int z = Integer.parseInt(line3);
        triangleCheck(x,y,z);
    }

    public static void triangleCheck(int x, int y, int z) {
        if (x >= z + y || y >= z + x || z >= x +y) {
            System.out.println("Треугольник не существует.");
        } else {
            System.out.println("Треугольник существует.");
        }
    }
}