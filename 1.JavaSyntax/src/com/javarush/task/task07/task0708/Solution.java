package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       ArrayList <String> list = new ArrayList<>(); //напишите тут ваш код
        int max = 0;
        String s;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<5; i++) {

            s=reader.readLine();
            list.add(s);


            if (max < s.length())
                max = s.length();

        }

        for (int i=0; i<5; i++) {
            s = list.get(i).toString();
            if (s.length() == max)
                System.out.println(list.get(i));


        }

    }
}
