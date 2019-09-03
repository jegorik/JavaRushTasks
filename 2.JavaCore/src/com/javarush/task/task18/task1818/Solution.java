package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());
        File file3 = new File(reader.readLine());
        reader.close();

        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        FileInputStream fileInputStream1 = new FileInputStream(file2);
        FileInputStream fileInputStream2 = new FileInputStream(file3);

        while (fileInputStream1.available() > 0) {
            byte[] buffer = new byte[fileInputStream1.available()];
            int count = fileInputStream1.read(buffer);
            fileOutputStream.write(buffer,0,count);
        }
        fileInputStream1.close();

        while (fileInputStream2.available() > 0) {
            byte[] buffer = new byte[fileInputStream2.available()];
            int count = fileInputStream2.read(buffer);
            fileOutputStream.write(buffer,0,count);
        }

        fileInputStream2.close();
        fileOutputStream.close();
    }
}
