package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] array = new int[3];
        for (int i = 0; i < 3; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            int x = Integer.parseInt(line);
            array[i] = x;
        }
        Arrays.sort(array);
        System.out.println(array[1]);
    }
}
