package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        reader.close();
        FileInputStream file = new FileInputStream(line);
        int i = 0;
        while ((i = file.read()) != -1) {
            System.out.print((char) i);
        }
        file.close();
    }
}