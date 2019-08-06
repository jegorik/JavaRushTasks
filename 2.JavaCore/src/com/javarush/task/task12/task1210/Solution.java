package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        long z = 200483647;
        long i = 200483647;
        double c = 2.34;
        double n = 1.2;

        max(x,y);
        max(z,i);
        max(c,n);
    }

    public static int max (int x, int y) {
        return x > y ? x : y;
    }

    public static long max (long x, long y) {
        return x > y ? x : y;
    }

    public static double max (double x, double y) {
        return x > y ? x : y;
    }
}
