package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int minString = list.get(0).length();
        int maxString = 0;

        for (int i = 1; i < list.size(); i++) {
            if (minString > list.get(i).length()) minString = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > maxString) maxString = list.get(i).length();
        }

        boolean find = false;

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).length() == maxString) || (list.get(i).length() == minString)) {
                find = true;
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
