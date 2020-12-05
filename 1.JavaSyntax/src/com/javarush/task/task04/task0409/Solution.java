package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
        Integer s1 = 10-a;
        Integer s2 = 10-b;
        Integer c1 = abs(s1);
        Integer c2 = abs(s2);

        if (c1<c2)
           System.out.println(a);
        else
            System.out.println(b);



    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}