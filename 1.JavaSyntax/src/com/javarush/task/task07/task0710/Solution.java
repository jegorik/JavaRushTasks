package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String line = reader.readLine();
                strings.add(0,line);
        }
        for (int i = 0; i < strings.size();  i++) {
            System.out.println(strings.get(i));
        }
    }
}
