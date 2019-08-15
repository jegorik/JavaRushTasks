package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1d,"a");
        labels.put(2d,"b");
        labels.put(3d,"c");
        labels.put(4d,"d");
        labels.put(5d,"e");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
