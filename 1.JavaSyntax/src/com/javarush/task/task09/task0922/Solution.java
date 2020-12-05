package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        SimpleDateFormat newFormat = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        Date d = new Date(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println(newFormat.format(d).toUpperCase());
    }
}
