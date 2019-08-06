package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Andreas", df.parse("JULY 15 2001"));
        map.put("Milton", df.parse("SEPTEMBER 17 1984"));
        map.put("Lavcraft", df.parse("JANUARY 3 1967"));
        map.put("Osborn", df.parse("AUGUST 28 2010"));
        map.put("Blumberg", df.parse("MAY 7 1995"));
        map.put("Austin", df.parse("NOVEMBER 13 1972"));
        map.put("Beck", df.parse("FEBRUARY 26 1982"));
        map.put("Mayers", df.parse("DECEMBER 1 2011"));
        map.put("Lincoln", df.parse("JUNE 11 1956"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator <Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Date> value = iterator.next();
            Date data = value.getValue();
            String str = String.format("%tb",data);
            if (str.equals("Jun") | str.equals("Jul") | str.equals("Aug")) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}