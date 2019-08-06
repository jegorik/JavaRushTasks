package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        String[] monthsNames = {null,"January","February","March","April","May","June","July","August","September","October","November","December"};
        HashMap<Integer,String> monthsAndNumbers = new HashMap<Integer, String>();
        for (int i = 1; i < monthsNames.length; i++){
            monthsAndNumbers.put(i,monthsNames[i]);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (true) {
            line = reader.readLine();
            break;
        }

        for (HashMap.Entry<Integer,String> x : monthsAndNumbers.entrySet() ) {
            int key = x.getKey();
            String value = x.getValue();
            if (value.equals(line)) {
                System.out.println(line + " is the " + key + " month");

            }
        }
    }
}
