package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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
        if (x == y & x == z ) {
            System.out.println(x + " " + y + " " + z);
        } else if (x != y & y == z) {
            System.out.println(y + " " + z);
        } else  if (x == y & y != z ) {
            System.out.println(x + " " + y);
        } else if (x != y & x == z ) {
            System.out.println(x + " " + z);
        }

    }
}