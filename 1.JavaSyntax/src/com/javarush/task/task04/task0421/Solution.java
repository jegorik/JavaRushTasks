package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String line2 = reader.readLine();
        int a = line.length();
        int b = line2.length();
        if (line.equals(line2) == true) {
            System.out.println("Имена идентичны");
        } else if (a == b){
            System.out.println("Длины имен равны");
        }
    }
}
