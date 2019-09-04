package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());
        reader.close();

        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);

        byte[] buffer1 = new byte[fileInputStream1.available()];
        fileInputStream1.close();

        byte[] buffer2 = new byte[fileInputStream2.available()];
        fileInputStream2.close();

        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        fileOutputStream.write(buffer2);
        fileOutputStream.write(buffer1);

        fileOutputStream.close();
    }
}

