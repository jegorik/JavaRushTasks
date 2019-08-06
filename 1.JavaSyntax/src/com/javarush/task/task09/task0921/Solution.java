package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                array.add(Integer.parseInt(reader.readLine()));
            }
        } catch (Exception e) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
