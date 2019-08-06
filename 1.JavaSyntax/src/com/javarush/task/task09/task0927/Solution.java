package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> cats = new HashMap<String, Cat>();
        for (int i = 0; i < 10 ; i++) {
            Cat cat = new Cat("cat" + i);
            cats.put(cat.name, cat);
        }
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<Cat>();
        for (HashMap.Entry<String,Cat> value : map.entrySet()) {
            Cat thiscat = value.getValue();
            cats.add(thiscat);
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {

            this.name = name;
        }

        public String toString() {

            return "Cat " + this.name;
        }
    }


}
