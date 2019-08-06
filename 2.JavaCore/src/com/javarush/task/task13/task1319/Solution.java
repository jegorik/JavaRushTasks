package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader filename = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = new FileWriter(filename.readLine());
        BufferedWriter buffer = new BufferedWriter(writer);
        BufferedReader stringReader = new BufferedReader(new InputStreamReader(System.in));
        String consoleInput = "";
        while (!consoleInput.equals("exit")) {
            consoleInput = stringReader.readLine();
            buffer.write(consoleInput);
            buffer.newLine();
        }
        buffer.close();
    }
}
