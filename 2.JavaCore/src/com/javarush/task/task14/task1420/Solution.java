package com.javarush.task.task14.task1420;

/*
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a <= 0 | b <= 0) {
            throw new Exception();
        } else {
            System.out.println(nod(a, b));
        }
    }

    public static int nod(int a, int b) {
        if (b == 0) return a;
        int x = a % b;
        return nod(b, x);
    }
}
