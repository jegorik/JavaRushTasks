package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Tom",25,"Street one");
        Man man2 = new Man(null,16,null);
        Woman woman1 = new Woman(null,32,"Street two");
        Woman woman2 = new Woman("Johana",21,"Street 7");
        System.out.println(man1.getName() + " " + man1.getAge() + " " + man1.getAddress());
        System.out.println(man2.getName() + " " + man2.getAge() + " " + man2.getAddress());
        System.out.println(woman1.getName() + " " + woman1.getAge() + " " + woman1.getAddress());
        System.out.println(woman2.getName() + " " + woman2.getAge() + " " + woman2.getAddress());
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man() {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man(String name) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void setName(String name) {
            if (name == null) {
                this.name = "Unknown";
            } else {
                this.name = name;
            }
        }

        public String getName() { return name; }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Age can't be 0!");
            }
        }

        public int getAge() { return age; }

        public void setAddress(String address) {
            if (address== null) {
                this.address = "Unknown";
            } else {
                this.address = address;
            }
        }

        public String getAddress() { return address; }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman() {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman(String name) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void setName(String name) {
            if (name == null) {
                this.name = "Unknown";
            } else {
                this.name = name;
            }
        }

        public String getName() { return name; }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Age can't be 0!");
            }
        }

        public int getAge() { return age; }

        public void setAddress(String address) {
            if (address == null) {
                this.address = "Unknown";
            } else {
                this.address = address;
            }
        }

        public String getAddress() { return address; }

    }
}
