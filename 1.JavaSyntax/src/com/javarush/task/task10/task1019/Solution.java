package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (true) {
            String value = reader.readLine();
            if (value.isEmpty()) {
                break;
            }
            int id = Integer.parseInt(value);
            String name = reader.readLine();
            map.put(name, id);
            if (name.isEmpty()) {
                break;
            }
        }

        for (HashMap.Entry<String, Integer> value : map.entrySet()) {
            String name = value.getKey();
            int id = value.getValue();
            System.out.println(id + " " + name);
        }
    }
}
