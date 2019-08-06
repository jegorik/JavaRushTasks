package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        int stringlength = 0;
        int minlength = 2147483647;
        for (int i = 0; i < 5; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            strings.add(line);
            stringlength = strings.get(i).length();
            if (stringlength < minlength) {
                minlength = stringlength;
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == minlength){
                System.out.println(strings.get(i));
            }
        }
    }
}
