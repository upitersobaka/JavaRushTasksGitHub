package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sA1 = bufferedReader.readLine();
        Double nA1 =  Double.parseDouble(sA1);
        Double ost = nA1%5;

        if (ost<3)
            System.out.println("зелёный");
        else if (ost<4)
            System.out.println("желтый");
        else
            System.out.println("красный");

    }
}