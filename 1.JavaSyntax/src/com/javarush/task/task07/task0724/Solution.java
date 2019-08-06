package com.javarush.task.task07.task0724;

public class Solution {
    public static void main(String[] args) {
        Human pavel = new Human("Павел", true, 47);
        Human katja = new Human("Катя", false, 44);
        Human kolja = new Human("Николай", true, 42);
        Human nadja = new Human("Надежда", false, 45);
        Human anja = new Human("Аня", false, 21, pavel, katja);
        Human sergej = new Human("Сергей", true, 23, kolja, nadja);
        Human vika = new Human("Виктория", false, 1, sergej, anja);
        Human stas = new Human("Станислав", true, 13, pavel, katja);
        Human andrej = new Human("Андрей", true, 16, kolja, nadja);
        System.out.println(pavel.toString());
        System.out.println(katja.toString());
        System.out.println(kolja.toString());
        System.out.println(nadja.toString());
        System.out.println(anja.toString());
        System.out.println(sergej.toString());
        System.out.println(vika.toString());
        System.out.println(stas.toString());
        System.out.println(andrej.toString());
    }


    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}