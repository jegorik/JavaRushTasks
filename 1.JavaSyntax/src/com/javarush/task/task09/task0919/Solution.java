package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) throws ArithmeticException {
        try {
            divideByZero();
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }

    }

    public static void divideByZero() {
        int x = 4;
        x = x / 0;
        System.out.println(x);
    }
}
