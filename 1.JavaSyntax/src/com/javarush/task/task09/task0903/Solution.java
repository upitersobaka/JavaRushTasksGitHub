package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        Integer i = 1;
        Integer line=0;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            if (i==3)
                line = element.getLineNumber();
            i++;
        }
        return line;
    }

    public static int method2() {
        method3();
        Integer i = 1;
        Integer line=0;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            if (i==3)
                line = element.getLineNumber();
            i++;
        }
        return line;
    }

    public static int method3() {
        method4();
        Integer i = 1;
        Integer line=0;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            if (i==3)
                line = element.getLineNumber();
            i++;
        }
        return line;
    }

    public static int method4() {
        method5();
        Integer i = 1;
        Integer line=0;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            if (i==3)
                line = element.getLineNumber();
            i++;
        }
        return line;
    }

    public static int method5() {
        Integer i = 1;
        Integer line=0;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            if (i==3)
                line = element.getLineNumber();
            i++;
        }
        return line;
    }
}
