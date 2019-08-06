package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String sonName = reader.readLine();
        Cat catSon = new Cat(catFather, sonName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        String grandsonName = reader.readLine();
        Cat catgrandSon = new Cat(grandsonName, catDaughter, catSon);

        String granddaughterName = reader.readLine();
        Cat catgrandDaughter = new Cat(granddaughterName, catDaughter, catSon);

        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
        System.out.println(catgrandSon);
        System.out.println(catgrandDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mom = null;
        private Cat dad = null;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mom) {
            this.name = name;
            this.mom = mom;
        }

        Cat(Cat dad, String name) {
            this.name = name;
            this.dad = dad;
        }

        Cat(String name, Cat mom, Cat dad) {
            this.name = name;
            this.mom = mom;
            this.dad = dad;
        }

        @Override
        public String toString() {
            String result = null;
            if (mom == null & dad == null) {
                result = "The cat's name is " + name + ", no mother" + ", no father";
            }
            else if (mom == null & dad != null) {
                result = "The cat's name is " + name + ", no mother" + ", father is " + dad.name;
            }
            else if (dad == null) {
                result = "The cat's name is " + name + ", mother is " + mom.name + ", no father";
            }
            else {
                result = "The cat's name is " + name + ", mother is "+ mom.name + ", father is " + dad.name;
            }
            return result;
        }
    }
}
