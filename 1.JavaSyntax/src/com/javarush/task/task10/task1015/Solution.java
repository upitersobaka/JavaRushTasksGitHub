package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();

        printList(arrayOfStringList);
    }



    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayStr = new ArrayList[2];

        arrayStr[0] = new ArrayList<String>();
        arrayStr[0].add("Первый элемент");
        arrayStr[0].add("Второй элемент");

        arrayStr[1] = new ArrayList<String>();
        arrayStr[1].add("Первый элемент 2");
        arrayStr[1].add("Второй элемент 2");
        return arrayStr;




    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}