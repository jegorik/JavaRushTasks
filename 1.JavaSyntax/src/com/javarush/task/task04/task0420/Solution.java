package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String line2 = reader.readLine();
        String line3 = reader.readLine();
        int x = Integer.parseInt(line);
        int y = Integer.parseInt(line2);
        int z = Integer.parseInt(line3);
        Integer[] array = {x,y,z};
        Arrays.sort(array, Collections.reverseOrder());
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
