package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(reader.readLine());
            numbers[i] = num;
        }
        Arrays.sort(numbers);
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
    }
}