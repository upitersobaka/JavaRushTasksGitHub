package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Vannya", 18);
    }

    static class Person {
        private String name;//напишите тут ваш код
        private int age;

        public void initialize(String name, int age){
            this.name = name;
            this.age  = age;
        }

    }
}
