package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputline = reader.readLine();
        String numberlength = null;
        double number = (Integer.parseInt(inputline) / 2d);
        while (inputline.length() <=3 & number != 0) {
            for (int i = 0; i < inputline.length(); i++) {
                String[] array1 = {"однозначное", "двузначное", "трехзначное"};
                numberlength = array1[i];
            }

            boolean even = ((((int) number) - number) == 0);

            if (even) {
                System.out.println("четное " + numberlength + " число");
            } else if (!even) {
                System.out.println("нечетное " + numberlength + " число");
            }
            break;
        }
    }
}
