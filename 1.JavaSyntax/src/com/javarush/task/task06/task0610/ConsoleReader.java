package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           String line = reader.readLine();
           return line;
    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(reader.readLine());
        return line;
    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double line = Double.parseDouble(reader.readLine());
        return line;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean line = Boolean.parseBoolean(reader.readLine());
        return line;
    }

    public static void main(String[] args) {

    }
}
