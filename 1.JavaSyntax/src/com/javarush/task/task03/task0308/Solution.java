package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
       int i=1;
       int result=1;
       while (i<11)
       {
           result = result * i;
           i++;
       }
        System.out.println(result);

    }
}
