package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n ; i++) {
            strings.add(reader.readLine());
        }
        for (int i = 0; i < m ; i++) {
            strings.add(strings.get(i));
        }
        for (int i = 1; i < m + 1; i++) {
            strings.remove(i-i);
        }
        for (String line : strings) {
            System.out.println(line);
        }
    }
}
