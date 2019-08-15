package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.time.temporal.ValueRange;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern patternNum = Pattern.compile("[-+]?\\d+");
        Matcher check;
        boolean result;
        String line = "";
        while (true) {
            line = reader.readLine();
            if (line.equals("exit")) break;
            check = patternNum.matcher(line);
            result = check.matches();
            if (result) {
                int value = Integer.parseInt(line);
                if (ValueRange.of(1, 127).isValidIntValue(value)) {
                    print(Short.parseShort(line));
                } else {
                    print(value);
                }
            } else {
                try {
                    print(Double.parseDouble(line));
                } catch (NumberFormatException e) {
                    print(line);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
