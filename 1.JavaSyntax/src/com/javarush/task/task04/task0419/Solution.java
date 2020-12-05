package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sA1 = bufferedReader.readLine();
        String sA2 = bufferedReader.readLine();
        String sA3 = bufferedReader.readLine();
        String sA4 = bufferedReader.readLine();
        Integer nA1 = Integer.parseInt(sA1);
        Integer nA2 = Integer.parseInt(sA2);
        Integer nA3 = Integer.parseInt(sA3);
        Integer nA4 = Integer.parseInt(sA4);

        Integer nMax,nMax1,nMax2;

        nMax1 = abc(nA1,nA2);
        nMax2 = abc(nA3,nA4);
        nMax = abc(nMax1,nMax2);

        System.out.println(nMax);






    }
    public static int abc(int a, int b){
        if ( a > b)
            return a;
        else
            return b;

    }



}
