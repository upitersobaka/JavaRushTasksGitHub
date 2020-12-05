package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arrayInt20 = new int[20];
        int[] arrayInt1 = new int[10];
        int[] arrayInt2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<20; i++) {
            arrayInt20[i] = Integer.parseInt(reader.readLine());
            if (i < 10)
                arrayInt1[i] = arrayInt20[i];
            else
                arrayInt2[i-10] = arrayInt20[i];
        }

        for (int i=0; i<10; i++)
            System.out.println(arrayInt2[i]);

    }
}
