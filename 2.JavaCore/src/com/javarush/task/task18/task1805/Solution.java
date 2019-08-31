package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        TreeSet<Byte> sortedSet = new TreeSet<>();

        while (inputStream.available() > 0) {
            sortedSet.add((byte) inputStream.read());
        }
        inputStream.close();
        StringBuilder result = new StringBuilder();
        for (Byte value : sortedSet) {
            result.append(value).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
