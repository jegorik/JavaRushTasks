package com.javarush.task.task18.task1817;

/* 
Пробелы
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

        int spaceSymbol = 0;
        int otherSymbols = 0;
        for (Character value : list) {
            if (value == 32) {
                spaceSymbol++;
                otherSymbols++;
            } else {
                otherSymbols++;
            }
        }
        double result = (double) 100*spaceSymbol/otherSymbols;
        System.out.printf("%.2f",result);
    }
}

