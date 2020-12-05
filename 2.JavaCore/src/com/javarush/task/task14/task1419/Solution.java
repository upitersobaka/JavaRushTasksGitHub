package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код



        try {
            ArrayList list = new ArrayList<>();
            list.get(3);

            } catch (Exception e) {
                exceptions.add(e);
            }






    }
}
