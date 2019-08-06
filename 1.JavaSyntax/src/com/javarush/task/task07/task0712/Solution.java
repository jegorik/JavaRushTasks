package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            strings.add(line);
        }

        int minlength = strings.get(0).length();
        int maxlength = strings.get(0).length();
        int minindex = 0;
        int maxindex = 0;

        for (int j = 0; j < strings.size(); j++) {
            if (strings.get(j).length() < minlength) {
                minlength = strings.get(j).length();
                minindex = j;
            } else if (strings.get(j).length() > maxlength) {
                maxlength = strings.get(j).length();
                maxindex = j;
            }
        }

        int result = minindex < maxindex ?  minindex : maxindex;
        System.out.println(strings.get(result));
    }
}
