package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> list = new HashMap<String,Integer>();
        list.put("Иванов",1000);
        list.put("Григорьев",750);
        list.put("Пригожин",340);
        list.put("Маляров", 890);
        list.put("Хабенский",450);
        list.put("Фадеев", 2100);
        list.put("Семенов", 1420);
        list.put("Артемьев", 500);
        list.put("Хомяков",980);
        list.put("Радин",745);
        return list;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String,Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> cell : copy.entrySet()) {
            if (cell.getValue() < 500) {
                map.remove(cell.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}