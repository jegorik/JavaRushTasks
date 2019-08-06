package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader readFile = new BufferedReader(new InputStreamReader(System.in));
        File newFile = new File(readFile.readLine());
        readFile.close();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(newFile)));
        String readerValue;
        while ((readerValue = reader.readLine()) != null) {
            list.add(Integer.parseInt(readerValue));
        }
        reader.close();
        Collections.sort(list);
        for (Integer value : list) {
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }
    }
}
