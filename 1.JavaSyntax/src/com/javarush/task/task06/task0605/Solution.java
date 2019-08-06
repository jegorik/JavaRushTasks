package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            String [] array = {"Недовес: меньше чем 18.5","Нормальный: между 18.5 и 24.9",
                    "Избыточный вес: между 25 и 29.9","Ожирение: 30 или больше"};
            double bmi = weight / (height * height);
            if (bmi >= 18.5 & bmi <= 24.9) {
                System.out.println(array[1]);
            } else if (bmi >= 25 & bmi <= 29.9) {
                System.out.println(array[2]);
            } else if (bmi >= 30){
                System.out.println(array[3]);
            } else {
                System.out.println(array[0]);
            }

        }
    }
}
