package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int i = 0;
            String line = reader.readLine();
            i++;
            int lineNUM = i;
            String line2 = reader.readLine();
            i++;
            int line2NUM = i;
            String line3 = reader.readLine();
            i++;
            int line3NUM = i;
            int x = Integer.parseInt(line);
            int y = Integer.parseInt(line2);
            int z = Integer.parseInt(line3);
            if (x == y & x != z) {
                System.out.println(line3NUM);
            } else if (y == z & y != x) {
                System.out.println(lineNUM);
            } else if (z == x & z != y) {
                System.out.println(line2NUM);
            }
    }
}
