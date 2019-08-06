package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> list = new HashMap<String,String>();
        list.put("Иванов","Андрей");
        list.put("Григорьев","Сергей");
        list.put("Пригожин","Александр");
        list.put("Маляров", "Павел");
        list.put("Хабенский","Владимир");
        list.put("Фадеев", "Игорь");
        list.put("Семенов", "Андрей");
        list.put("Артемьев", "Олег");
        list.put("Хомяков","Дмитрий");
        list.put("Радин","Константин");
        return list;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> nameslist = new ArrayList<String>(map.values());
        Collections.sort(nameslist);
        for (int i = 0; i < nameslist.size()-1 ; i++) {
            if (nameslist.get(i).equals(nameslist.get(i+1))) {
                removeItemFromMapByValue(map,nameslist.get(i));
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
