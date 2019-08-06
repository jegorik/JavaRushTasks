package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> family = new ArrayList<Human>();
        ArrayList<Human> grandchildrens = new ArrayList<Human>();
        ArrayList<Human> parent1 = new ArrayList<Human>();
        ArrayList<Human> parent2 = new ArrayList<Human>();
        ArrayList<Human> grandparents = new ArrayList<Human>();

        Human sveta = new Human("Света", true, 2);
        Human semen = new Human("Семен", true, 5);
        Human andrej = new Human("Андрей", true, 16);
        Collections.addAll(grandchildrens,sveta,semen,andrej);

        Human anja = new Human("Аня", false, 21, grandchildrens);
        Human sergej = new Human("Сергей", true, 23, grandchildrens);
        Collections.addAll(parent1, anja);
        Collections.addAll(parent2,sergej);

        Human pavel = new Human("Павел", true, 47, parent1);
        Human katja = new Human("Катя", false, 44, parent1);
        Human kolja = new Human("Николай", true, 42, parent2);
        Human nadja = new Human("Надежда", false, 45, parent2);
        Collections.addAll(grandparents,pavel,katja,kolja,nadja);
        Collections.addAll(family, pavel, katja, kolja, nadja, anja, sergej,andrej, semen, sveta);

        for (Human value : family) {
            System.out.println(value.toString());
        }

    }

    public static class Human {
        ArrayList<Human> children = new ArrayList<Human>();
        String name;
        boolean sex;
        int age;

        public Human (String name, boolean sex,int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex,int age, ArrayList<Human> childrens) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = childrens;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
