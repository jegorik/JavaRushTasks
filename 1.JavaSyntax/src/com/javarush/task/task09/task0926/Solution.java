package com.javarush.task.task09.task0926;

import java.util.*;

/*
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> createList = new ArrayList<>();
        int[] five = {1,2,3,4,5};
        int[] two = {1,2};
        int[] four = {1,2,3,4};
        int[] seven = {1,2,3,4,5,6,7};
        int[] zero = {};
        for (int i = 5; i > 0 ; i--) {
            switch (i) {
                case 5 : createList.add(five);
                    break;
                case 4 : createList.add(two);
                    break;
                case 3 : createList.add(four);
                    break;
                case 2 : createList.add(seven);
                    break;
                case 1 : createList.add(zero);
                    break;
            }
        }
        return createList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
