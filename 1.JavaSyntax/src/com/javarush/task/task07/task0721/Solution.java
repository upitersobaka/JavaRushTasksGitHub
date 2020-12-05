package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] massiv = new int[20];

        for (int i=0; i<20; i++)
            massiv[i] = Integer.parseInt(reader.readLine());

        maximum = massiv[0];
        minimum = massiv[0];

        for (int i=0; i<20; i++){
            if (maximum < massiv[i])
                maximum = massiv[i];

            if (minimum > massiv[i])
                minimum = massiv[i];
        }


        System.out.print(maximum);
        System.out.println(" "+minimum);
    }
}
