package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;


/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> list = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        return list;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        for (Iterator<Integer> i = set.iterator(); i.hasNext();) {
            Integer check = i.next();
            if (check > 10) {
                i.remove();
            }
        }
        return set;
    }

    public static void main (String[]args){

    }
}
