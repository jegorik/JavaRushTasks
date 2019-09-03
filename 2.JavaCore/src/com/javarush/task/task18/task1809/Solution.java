package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());
        reader.close();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        byte[] buffer = null;
        int count = 0;
        while (inputStream.available() > 0) {
            buffer = new byte[inputStream.available()];
            count = inputStream.read(buffer);
        }
        for (int i = count - 1; i >= 0; i--) {
            outputStream.write(buffer[i]);
        }
        inputStream.close();
        outputStream.close();
    }
}

