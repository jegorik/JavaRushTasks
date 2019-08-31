package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        List<Byte> list = new ArrayList<>();

        while (inputStream.available() > 0) {
            list.add((byte) inputStream.read());
        }
        inputStream.close();

/* Faster with lambda
//        list.forEach(el -> {
//            checkList.put(el, checkList.getOrDefault(el, 0) + 1);
//        });
*/

        Map<Byte, Integer> checkList = new TreeMap<>();
        for (Byte number : list) {
            if (!checkList.containsKey(number)) {
                checkList.put(number, 1);
            } else {
                checkList.put(number, checkList.get(number) + 1);
            }
        }

        int minimalCounter = Integer.MAX_VALUE;
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Byte, Integer> value : checkList.entrySet()) {
            if (value.getValue() < minimalCounter) {
                minimalCounter = value.getValue();
            }
        }

        for (Map.Entry<Byte, Integer> value : checkList.entrySet()) {
            if (value.getValue() == minimalCounter) {
                result.append(value.getKey()).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}

