package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line1 = reader.readLine();
            String line2 = reader.readLine();
            int number = Integer.parseInt(line2);
            while (number != 0) {
                System.out.println(line1);
                number--;
            }
    }
}
