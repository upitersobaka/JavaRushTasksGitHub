package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList<>(); //напишите тут ваш код
        int max = 10000;
        String s;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<5; i++) {

            s=reader.readLine();
            list.add(s);


            if (max > s.length())
                max = s.length();

        }

        for (int i=0; i<5; i++) {
          //  s = list.get(i).toString();
            if (list.get(i).length() == max)
                System.out.println(list.get(i));


        }
    }
}
