package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

import java.util.SplittableRandom;

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        String str = method2();
        Integer i = 1;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            if (i==3)
           str = element.getMethodName();
            i++;
        }
        System.out.println(str);
        return str;

    }

    public static String method2() {
        String str = method3();
        Integer i = 1;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            if (i==3)
            str = element.getMethodName();
            i++;
        }
        System.out.println(str);
        return str;
    }

    public static String method3() {
        String str =method4();
        Integer i = 1;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            if (i==3)
            str = element.getMethodName();
            i++;
        }
        System.out.println(str);
        return str;
    }

    public static String method4() {
        String str = method5();
        Integer i = 1;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            if (i==3)
            str = element.getMethodName();
            i++;
        }
        System.out.println(str);
        return str;
    }

    public static String method5() {

        String str = ""; //напишите тут ваш код
        Integer i = 1;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            if (i==3)
            str = element.getMethodName();
            i++;
        }
        System.out.println(str);
        return str;
    }
}
