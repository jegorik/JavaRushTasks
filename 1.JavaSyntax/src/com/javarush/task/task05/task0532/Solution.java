package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputLength = Integer.parseInt(reader.readLine());

        if (inputLength == 0) {
            reader.close();
        } else {
            int maximum = 0;
            Integer[] array = new Integer[inputLength];

            for (int i = 0; i < inputLength; i++) {
                int numbersFlow = Integer.parseInt(reader.readLine());
                array[i] = numbersFlow;
            }

            Arrays.sort(array, Collections.reverseOrder());
            maximum = array[0];
            System.out.println(maximum);
        }
    }
}
