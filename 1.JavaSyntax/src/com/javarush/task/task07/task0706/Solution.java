package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] arraymain = new int[15];
        int sumeven = 0;
        int sumodd = 0;
        for (int i = 0; i < 15; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int line = Integer.parseInt(reader.readLine());
            arraymain[i] = line;
        }
        for (int i = 0; i < 15 ; i++) {
            double a = (i/2d);
            double check =(((int)a)-a);
            if (check == 0) {
                sumeven += arraymain[i];
            } else {
                sumodd += arraymain[i];
            }
        }
        String result = sumeven > sumodd ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.";
        System.out.println(result);
    }
}