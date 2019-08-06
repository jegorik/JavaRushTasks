package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String [] array = new String[4];
        for (int i = 0; i < 4; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            array[i] = line;
        }
        System.out.println("Меня зовут " + array[0] + ".");
        System.out.println("Я родился " + array[3] + "." + array[2] + "." + array[1]);
    }
}
