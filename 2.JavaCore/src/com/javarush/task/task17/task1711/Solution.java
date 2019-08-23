package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        try {
            switch (args[0]) {
                case "-c":
                    synchronized (allPeople) {
                        for (int i = 0; i < args.length; i = i + 3) {
                            create(args[i+1], args[i+2], args[i+3]);
                        }
                    }
                    break;
                case "-u":
                    synchronized (allPeople) {
                        for (int i = 0; i < args.length; i = i + 4) {
                            update(args[i+1], args[i+2], args[i+3], args[i+4]);

                        }
                    }
                    break;
                case "-d":
                    synchronized (allPeople) {
                        for (int i = 0; i < args.length; i = i + 1) {
                            delete(args[i+1]);
                        }
                    }
                    break;
                case "-i":
                    synchronized (allPeople) {
                        for (int i = 0; i < args.length; i = i + 1) {
                            showInfo(args[i+1]);
                        }
                    }
                    break;
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
