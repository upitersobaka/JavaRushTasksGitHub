package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        Integer sum = 0;

        if (nA1>0)
            sum = sum + 1;
        if (nA2>0)
            sum = sum + 1;
        if (nA3>0)
            sum = sum + 1;

        System.out.println(sum);


    }
}
