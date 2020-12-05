package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 3;
        this.weight = 2;
        this.color = "Black";
    }

    public void initialize(String name,  int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Black";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.color = "Black";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 3;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 3;
    }

    public static void main(String[] args) {

    }
}
