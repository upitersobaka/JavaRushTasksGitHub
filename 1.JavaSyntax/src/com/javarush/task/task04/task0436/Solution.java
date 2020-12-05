package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sM = bufferedReader.readLine();
        String sN = bufferedReader.readLine();
        Integer nM = Integer.parseInt(sM);
        Integer nN = Integer.parseInt(sN);

        for (int i=1; i<=nM; i++) {
            for (int a = 1; a <= nN; a++)
                System.out.print(8);
            System.out.println();
        }
    }
}
