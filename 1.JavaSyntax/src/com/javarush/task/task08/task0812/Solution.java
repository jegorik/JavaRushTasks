package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Integer number = Integer.parseInt(reader.readLine());
            list.add(number);
        }
        int max = 1;
        int check = 1;
        for (int i = 0; i < list.size()-1 ; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                check++;
                if (max < check)
                    max = check;
            }
            else
                check=1;
        }
        System.out.println(max);
    }
}
