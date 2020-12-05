package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;




/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        String sA1;
        boolean cond=true;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        while (cond){
            sA1 = bufferedReader.readLine();
            if (sA1.equals("сумма"))
                cond =false;
            else
             sum = Integer.parseInt(sA1) + sum;

        }

        System.out.println(sum);
    }
}
