package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        boolean start = true;
        int sum = 0;
        while (start) {
            int i = 0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            int x = Integer.parseInt(line);
            i++;
            sum = sum + x;
            if (line.equals("-1")) {
                System.out.println(sum);
                break;
            }
        }
    }
}
