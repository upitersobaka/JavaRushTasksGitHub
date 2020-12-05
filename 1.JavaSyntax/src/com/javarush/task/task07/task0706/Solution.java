package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arrayInt = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sumC = 0;
        int sumN = 0;

        for (int i=0; i<15; i++) {
            arrayInt[i] = Integer.parseInt(reader.readLine());
            if (i==0)
                sumC = arrayInt[i];
            if (i%2==0)
                sumC = sumC + arrayInt[i];
            else
                sumN = sumN + arrayInt[i];
        }

        if (sumC>sumN)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
