package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i=0; i< 10; i++)
            list.add(reader.readLine());

        ArrayList<String> result = doubleValues(list);


        for (int i = 0; i< result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public static ArrayList doubleValues(ArrayList<String> list) {
        for (int i=1; i<= list.size(); i=i+2) {
            list.add(i, list.get(i - 1));
        }
        return list;
    }
}
