package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        int m,m1,m2;
        m1 = min(a,b);//напишите тут ваш код
        m2 = min(c,d);
        m  = min(m1,m2);
        return m;

    }

    public static int min(int a, int b) {
        int result;
        if (a<b) //напишите тут ваш код
            return a;
        else
            return b;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}