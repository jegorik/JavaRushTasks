package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();

        while (true) {
            String check = reader.readLine();
            if (check.equals("end")) break;
            strings.add(check);
        }
        for (int i = 0; i < strings.size() ; i++) {
            System.out.println(strings.get(i));
        }
    }
}