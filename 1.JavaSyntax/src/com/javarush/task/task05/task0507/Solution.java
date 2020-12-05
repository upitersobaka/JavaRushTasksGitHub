package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String sA1;
        double sum = 0;
        int i = 0;
        int kol = 0;
        double avr = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));

        while (i != -1) {
            sA1 = bufferedReader.readLine();
            i = Integer.parseInt(sA1);
            if (i != -1){
                sum = sum + i;
                kol = kol + 1;
            }

        }


        avr = sum / kol;
        System.out.println(avr);



    }
}

