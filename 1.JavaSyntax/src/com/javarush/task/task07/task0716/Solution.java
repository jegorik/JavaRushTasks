package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size();) {
            boolean l = false;
            boolean r = false;
            for (int j = 0; j < list.get(i).length(); j++) {
                char c = list.get(i).charAt(j);
                if (c == 1088) {
                    r = true;
                } else if (c == 1083) {
                    l = true;
                }
            }
            if (r == true & l == false) {
                list.remove(i);
            } else if (r == false & l == true) {
                list.add(i,list.get(i));
                i+=2;
            } else {
                i++;
            }
        }
        return list;
    }
}