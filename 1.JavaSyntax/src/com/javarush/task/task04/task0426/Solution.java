package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sA1 = bufferedReader.readLine();
        Integer nA1 = Integer.parseInt(sA1);

        Integer nOst = nA1%2;

        Boolean m = (nOst==0);
        String s;

        if (nA1>0)
            s = "положительное ";
        else
            s = "отрицательное ";

        if (nA1==0)
            System.out.println("ноль");
        else if (m)
            System.out.println(s+"четное число");
        else
            System.out.println(s+"нечетное число");
    }
}
