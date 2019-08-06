package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String className = o.getClass().getSimpleName();
        String result = "Животное";
        switch (className) {
            case "Cat":
                result = "Кот";
                break;
            case "Tiger":
                result = "Тигр";
                break;
            case "Lion":
                result = "Лев";
                break;
            case "Bull":
                result = "Бык";
                break;
        }
        return result;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
