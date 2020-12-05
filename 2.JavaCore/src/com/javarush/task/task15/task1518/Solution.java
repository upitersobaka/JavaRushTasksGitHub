package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;


    static {
        Cat myCat = new Cat();
        myCat.name = "Petya";
        cat = myCat;
        System.out.println(myCat.name);
    }

    public static void main(String[] args) {

    //    System.out.println(cat.name);

    }

   /* static {
        System.out.println(cat.name);
    }*/



    public static class Cat{
        public String name = "Vasya";
    }
}
