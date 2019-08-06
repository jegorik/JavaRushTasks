package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name = null;
    int age = 4;
    int weight = 3;
    String address = null;
    String color = "default";

    public void initialize(String name) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
