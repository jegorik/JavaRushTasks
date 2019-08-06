package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> list = new HashSet<String>();
        list.add("арбуз");
        list.add("банан");
        list.add("вишня");
        list.add("груша");
        list.add("дыня");
        list.add("ежевика");
        list.add("женьшень");
        list.add("земляника");
        list.add("ирис");
        list.add("картофель");
        for (String o: list) {
            System.out.println(o);
        }
    }
}
