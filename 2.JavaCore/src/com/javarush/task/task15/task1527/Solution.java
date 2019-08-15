package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Парсер реквестов
*/

public class Solution {
    private static ArrayList<String> urlParams = new ArrayList<>();
    private static ArrayList<String> checkParams = new ArrayList<>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String url = reader.readLine();
            doit(url);
            showParams(urlParams);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doit(String url) {
        int i = url.indexOf("?");
        if (i > -1) {
            String searchURL = url.substring(url.indexOf("?") + 1);
            searchParams(searchURL);
        }
    }

    private static void searchParams(String search) {
        String[] params = search.split("&");
        for (String param : params) {
            if (param.contains("obj=")) {
                String result = param.substring(param.indexOf("=") + 1);
                checkParams.add(result);
            }
            String[] temp = param.split("=");
            urlParams.add(temp[0]);
        }
    }

    private static void showParams(ArrayList<String> arrayList) {
        for (String param : arrayList) {
            System.out.print(param + " ");
        }
        System.out.println();
        if (!checkParams.isEmpty()) {
            for (String value : checkParams) {
                try {
                    double result = Double.parseDouble(value);
                    alert(result);
                } catch (Exception e) {
                    alert(value);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}