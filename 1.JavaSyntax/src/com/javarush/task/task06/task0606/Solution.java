package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputline = reader.readLine();
        char[] charsarray = inputline.toCharArray();
        for (int i = 0; i < charsarray.length; i++) {
            int [] numbersarray = new int[charsarray.length];
            numbersarray[i] = Character.getNumericValue(charsarray[i]);
            double z = (numbersarray[i]/2d);
            double check = (z - ((int) z));
            if (check == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}

