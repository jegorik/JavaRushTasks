package com.javarush.task.task18.task1816;

/*
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        List<Character> list = new ArrayList<>();
        while (inputStream.available() > 0) {
            list.add((char) inputStream.read());
        }
        inputStream.close();

        int count = 0;
        for (Character value : list) {
            if (String.valueOf(value).matches(".*[A-Za-z].*")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
