package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private int age;
        private String name;
        private float weight;
        private boolean male;
        private Integer height;
        private String color;

        public Human(int age, String name, float weight, String color) {
            this.age = age;
            this.name = name;
            this.weight = weight;
            this.color = color;
        }

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Human(float weight, Integer height, String color) {
            this.weight = weight;
            this.height = height;
            this.color = color;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(boolean male, Integer height, String color) {
            this.male = male;
            this.height = height;
            this.color = color;
        }

        public Human(int age, String name, float weight, boolean male, Integer height, String color) {
            this.age = age;
            this.name = name;
            this.weight = weight;
            this.male = male;
            this.height = height;
            this.color = color;
        }


        public Human(int age, String name, String color) {
            this.age = age;
            this.name = name;
            this.color = color;
        }

        public Human(int age, String name, boolean male) {
            this.age = age;
            this.name = name;
            this.male = male;
        }

        public Human(String name, float weight, String color) {
            this.name = name;
            this.weight = weight;
            this.color = color;
        }
    }
}
