package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static  int sumDigitsInNumber(int number) {
        char[] back = Integer.toString(number).toCharArray();
        int sum = 0;
        for (int i = 0; i < back.length; i++) {
            int [] ter = new int[3];
            ter[i] = Character.getNumericValue(back[i]);
            sum += ter[i];
        }
        return sum;
    }
}