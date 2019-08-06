package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        int stringlength = 0;
        int maxlength = 0;
        for (int i = 0; i < 5; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            strings.add(line);
            stringlength = strings.get(i).length();
            if (stringlength > maxlength) {
                maxlength = stringlength;
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == maxlength){
                System.out.println(strings.get(i));
            }
        }
    }
}