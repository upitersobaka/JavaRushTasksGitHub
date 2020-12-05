package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sAge = bufferedReader.readLine();
        Integer nAge = Integer.parseInt(sAge);
        Integer result;

        if (nAge>0)
          result = nAge*2;
        else if (nAge<0)
            result = nAge+1;
        else
            result = 0;
        System.out.println(result);

    }

}