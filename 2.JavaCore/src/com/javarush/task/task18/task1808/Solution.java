package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());
        File file3 = new File(reader.readLine());
        reader.close();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream1 = new FileOutputStream(file2);
        FileOutputStream outputStream2 = new FileOutputStream(file3);

        while (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            int lesserPart = count / 2;
            int biggerPart = count - lesserPart;


            outputStream1.write(buffer, 0, biggerPart);
            outputStream2.write(buffer, biggerPart, lesserPart);
        }
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
