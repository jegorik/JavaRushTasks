package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        List<Character> list = new ArrayList<>();
        int count = 0;

        while (inputStream.available() > 0) {
            list.add((char) inputStream.read());
        }
        inputStream.close();

        for (Character value : list) {
            if (value == 44) {
                count++;
            }
        }
        System.out.println(count);
    }
}
