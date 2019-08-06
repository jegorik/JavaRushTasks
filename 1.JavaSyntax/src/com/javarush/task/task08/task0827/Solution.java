package com.javarush.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(date));

        return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;
    }
}
