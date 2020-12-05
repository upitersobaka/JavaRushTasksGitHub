package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sA1 = bufferedReader.readLine();
        String sA2 = bufferedReader.readLine();

        if (sA1.equals(sA2))
            System.out.println("Имена идентичны");
        else if (sA1.length()==sA2.length())
            System.out.println("Длины имен равны");
    }
}
