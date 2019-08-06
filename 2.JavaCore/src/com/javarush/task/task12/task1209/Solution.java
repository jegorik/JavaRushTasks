package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        long z = 200483647;
        long i = 200483647;
        double c = 2.34;
        double n = 1.2;

        min(x,y);
        min(z,i);
        min(c,n);
    }

    public static int min (int x, int y) {
        return x < y ? x : y;
    }

    public static long min (long x, long y) {
        return x < y ? x : y;
    }

    public static double min (double x, double y) {
        return x < y ? x : y;
    }
}
