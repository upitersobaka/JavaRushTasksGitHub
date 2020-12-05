package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sA1 = bufferedReader.readLine();
        Integer nA1 = Integer.parseInt(sA1);
        String sA2 = bufferedReader.readLine();
        Integer nA2 = Integer.parseInt(sA2);
        String sA3 = bufferedReader.readLine();
        Integer nA3 = Integer.parseInt(sA3);

        if (nA1>=(nA2+nA3))
            System.out.println("Треугольник не существует.");
        else if (nA2>=(nA1+nA3))
            System.out.println("Треугольник не существует.");
        else if (nA3>=(nA2+nA1))
            System.out.println("Треугольник не существует.");
        else
            System.out.println("Треугольник существует.");
    }
}