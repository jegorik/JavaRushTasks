package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(method1());
    }

    public static int method1() {
        System.out.println(method2());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        System.out.println(method3());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        System.out.println(method4());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        System.out.println(method5());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {

        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
