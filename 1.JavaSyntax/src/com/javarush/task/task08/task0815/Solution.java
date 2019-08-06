package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;


/*
Перепись населения
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
        list.put("Семенов", "Артем");
        list.put("Артемьев", "Олег");
        list.put("Хомяков","Дмитрий");
        list.put("Радин","Константин");
        return list;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int namescount = 0;
        for(Map.Entry<String,String> check : map.entrySet()) {
            String key = check.getValue();
            if (name.equals(key)) {
                namescount++;
            }
        }
        return namescount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int surnamescount = 0;
        for(Map.Entry<String,String> check : map.entrySet()) {
            String key = check.getKey();
            if (lastName.equals(key)) {
                surnamescount++;
            }
        }
        return surnamescount;
    }

    public static void main(String[] args) {

    }
}
