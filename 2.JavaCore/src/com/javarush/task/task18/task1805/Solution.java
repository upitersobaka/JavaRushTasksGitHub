package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.SortedMap;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(str);

      //  Map<Integer,Integer> map = new SortedMap<Integer, Integer>();


        while (fileInputStream.available()> 0) {
            int nextByte = fileInputStream.read();

        }

    }
}
