package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] arraymain = new int[20];
        int [] array1 = new int[10];
        int [] array2 = new int[10];
        for (int i = 0; i < 20; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int line = Integer.parseInt(reader.readLine());
            arraymain[i] = line;
        }
        System.arraycopy(arraymain,0,array1,0,10);
        System.arraycopy(arraymain,10,array2,0,10);
        for (int i = 0; i < 10 ; i++) {
            System.out.println(array2[i]);
        }
    }
}
