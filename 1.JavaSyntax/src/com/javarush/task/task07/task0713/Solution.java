package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> mainstrings = new ArrayList<Integer>();
        ArrayList<Integer> mod3list = new ArrayList<Integer>();
        ArrayList<Integer> mod2list = new ArrayList<Integer>();
        ArrayList<Integer> elselist = new ArrayList<Integer>();

        fillList(mainstrings);

        for (int i = 0; i < mainstrings.size(); i++) {
            if (mainstrings.get(i) % 3 == 0 & mainstrings.get(i) % 2 != 0) {
                mod3list.add(mainstrings.get(i));
            } else if (mainstrings.get(i) % 2 == 0 & mainstrings.get(i) % 3 != 0) {
                mod2list.add(mainstrings.get(i));
            } else if (mainstrings.get(i) % 3 == 0 & mainstrings.get(i) % 2 == 0) {
                mod3list.add(mainstrings.get(i));
                mod2list.add(mainstrings.get(i));
            } else if (mainstrings.get(i) % 3 != 0 & mainstrings.get(i) % 2 != 0) {
                elselist.add(mainstrings.get(i));
            }
        }

        printList(mod3list);
        printList(mod2list);
        printList(elselist);
    }

    public static void  fillList (List <Integer> list) throws Exception {
        for (int i = 0; i < 20; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            list.add(Integer.parseInt(reader.readLine()));
        }
    }

    public static void printList (List <Integer > list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
