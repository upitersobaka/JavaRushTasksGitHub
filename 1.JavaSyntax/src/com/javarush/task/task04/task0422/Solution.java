package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sA1 = bufferedReader.readLine();
        String sVozr = bufferedReader.readLine();
        Integer nVozr = Integer.parseInt(sVozr);

        if (nVozr<18)
            System.out.println("Подрасти еще");
    }
}
