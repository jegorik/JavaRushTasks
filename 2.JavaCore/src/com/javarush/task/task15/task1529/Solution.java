package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = reader.readLine();
            if (line.equals("helicopter")) {
                result = new Helicopter();
                reader.close();
            } else if (line.equals("plane")) {
                line = reader.readLine();
                try {
                    result = new Plane(Integer.parseInt(line));
                    reader.close();
                } catch (Exception e) {
                    reader.close();
                    break;
                }
            }
            break;
        }
    }

}
