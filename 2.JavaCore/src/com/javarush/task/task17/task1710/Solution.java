package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        try {
            if (args[0].equals("-c")) {
                create(args[1], args[2], args[3]);
            } else if (args[0].equals("-u")) {
                update(args[1], args[2], args[3], args[4]);
            } else if (args[0].equals("-d")) {
                delete(args[1]);
            } else if (args[0].equals("-i")) {
                showInfo(args[1]);
            }
        } catch (Exception e) {
        }
    }

    private static void create(String name, String sex, String birthday) throws ParseException {
        Person person = null;
        Date date = parseBirthDay(birthday);
        if (sex.equals("м")) {
            person = Person.createMale(name, date);
        } else if (sex.equals("ж")) {
            person = Person.createFemale(name, date);
        }
        allPeople.add(person);
        System.out.println(allPeople.indexOf(person));
    }

    private static void update(String id, String name, String sex, String birthday) throws ParseException {
        Person person = allPeople.get(Integer.parseInt(id));
        person.setName(name);
        if (sex.equals("м")) {
            person.setSex(Sex.MALE);
        } else if (sex.equals("ж")) {
            person.setSex(Sex.FEMALE);
        }
        person.setBirthDate(parseBirthDay(birthday));
    }

    private static Date parseBirthDay(String birthday) throws ParseException {
        return new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(birthday);
    }

    private static void delete(String id) {
        Person person = allPeople.get(Integer.parseInt(id));
        person.setName(null);
        person.setSex(null);
        person.setBirthDate(null);
    }

    private static void showInfo(String id) throws ParseException {
        Person person = allPeople.get(Integer.parseInt(id));
        String sex = (person.getSex() == Sex.FEMALE) ? "ж" : "м";
        System.out.println(person.getName() + " " + sex + " " + new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDate()));
    }
}
