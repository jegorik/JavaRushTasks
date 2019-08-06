package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        return (this.weight + this.age + this.strength) < (anotherCat.weight + anotherCat.age+ anotherCat.strength);
    }

    public static void main(String[] args) {

    }
}
