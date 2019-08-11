package com.javarush.task.task14.task1419;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] array = {1, 2, 3};
            for (int i = 0; i < array.length + 1; i++) {
                int a;
                a = array[i];
            }
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String line = null;
            System.out.println(line.charAt(0));
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int num = Integer.parseInt("file");
            System.out.println(num);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String line = "Check";
            char c = line.charAt(12);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Class Check;
            Check = Class.forName("java.lang.String");
            Class[] paramTypes = new Class[5];
            Method method = Check.getDeclaredMethod("check", paramTypes);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IOException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new InterruptedException();
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
