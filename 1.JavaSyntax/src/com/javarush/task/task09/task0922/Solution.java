package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dateTS = new SimpleDateFormat("yyyy-M-d");
        String line = reader.readLine();
        Date date = dateTS.parse(line);
        System.out.println(String.format("%Tb %<td, %<tY",date));
    }
}
