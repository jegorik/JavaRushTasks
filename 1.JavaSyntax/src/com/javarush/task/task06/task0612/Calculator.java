package com.javarush.task.task06.task0612;

/* 
Калькулятор
Сделать класс Calculator, у которого будут 5 статических методов:
int plus(int a, int b) - возвращает сумму чисел a и b
int minus(int a, int b) - возвращает разницу чисел a и b
int multiply(int a, int b) - возвращает результат умножения числа a на число b
double division(int a, int b) - возвращает результат деления числа a на число b
double percent(int a, int b) - возвращает b процентов из числа a
*/

public class Calculator {
    public static int plus(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int minus(int a, int b) {
        int sum = a - b;
        return sum;
    }

    public static int multiply(int a, int b) {
        int sum = a * b;
        return sum;
    }

    public static double division(int a, int b) {
        double sum = a / (double)b;
        return sum;
    }

    public static double percent(int a, int b) {
        double sum = (a*b)/100d ;
        return sum;
    }

    public static void main(String[] args) {

    }
}