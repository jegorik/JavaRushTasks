package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends RuntimeException {
    }

    static class MyException2 extends Error{
    }

    static class MyException3 extends Throwable {
    }

    static class MyException4 extends Exception {
    }
}

