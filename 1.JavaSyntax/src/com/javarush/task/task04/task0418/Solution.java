package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import javax.swing.event.DocumentEvent;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sA1 = bufferedReader.readLine();
        String sA2 = bufferedReader.readLine();
        Integer nA1 = Integer.parseInt(sA1);
        Integer nA2 = Integer.parseInt(sA2);

        if (nA1 < nA2)
            System.out.println(nA1);
        else
            System.out.println(nA2);

    }
}