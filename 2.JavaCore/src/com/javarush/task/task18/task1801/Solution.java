package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        long bigestByte = Integer.MIN_VALUE;
        System.out.println(bigestByte);

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data > bigestByte) {
                bigestByte = data;
            }
        }
        inputStream.close();

        System.out.println(bigestByte);
    }
}
