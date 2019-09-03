package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            File file = new File(reader.readLine());
            FileInputStream inputStream = new FileInputStream(file);
            while (inputStream.available() > 0) {
                byte[] buffer = new byte[inputStream.available()];
                int count = inputStream.read(buffer);
                if (count < 1000) {
                    inputStream.close();
                    throw new DownloadException();
                }
            }
        }
    }

    public static class DownloadException extends Exception {
        public DownloadException() {

        }
    }
}