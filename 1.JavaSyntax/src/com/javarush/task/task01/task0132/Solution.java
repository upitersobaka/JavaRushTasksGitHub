package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        Integer sum=0;
        char c1;

        String s = Integer.toString(number);

        for (int i=0; i<s.length();i++)
        {
            c1 = s.charAt(i);
            //sum = sum + Integer.parseInt(c1);
            sum = sum + Character.getNumericValue(c1);


        }
      return sum;


    }
}