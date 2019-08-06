package com.javarush.task.task05.task0528;

/* 
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date realDate = new Date( );
        System.out.printf("%te %<tm %<tY", realDate);
    }
}
