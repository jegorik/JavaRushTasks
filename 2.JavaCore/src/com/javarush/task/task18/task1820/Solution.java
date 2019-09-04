package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(file1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));
        String line = fileReader.readLine();
        String[] lines = line.split(" ");

        for (String value : lines) {
            fileWriter.write((Math.round(Double.parseDouble(value)) + " "));
        }

        fileReader.close();
        fileWriter.flush();
        fileWriter.close();

    }
}
