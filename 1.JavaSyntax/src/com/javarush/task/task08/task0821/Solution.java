package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String,String> list = new HashMap<String,String>();
        list.put("Иванов","Андрей");
        list.put("Григорьев","Сергей");
        list.put("Пригожин","Александр");
        list.put("Маляров", "Павел");
        list.put("Хабенский","Владимир");
        list.put("Фадеев", "Игорь");
        list.put("Семенов", "Андрей");
        list.put("Артемьев", "Олег");
        list.put("Иванов","Дмитрий");
        list.put("Радин","Константин");
        return list;

    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
