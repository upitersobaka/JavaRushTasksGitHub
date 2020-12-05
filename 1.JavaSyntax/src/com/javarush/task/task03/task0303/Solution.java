package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100, 1.211514));
        System.out.println(convertEurToUsd(200, 1.5));//напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course) {
        double k1 = course;
        double dollar = eur * k1;
        return dollar; //напишите тут ваш код
      //  System.out.println(dollar);
    }
}
