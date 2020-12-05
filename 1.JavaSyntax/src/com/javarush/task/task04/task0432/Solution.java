package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = bufferedReader.readLine();
        String sN = bufferedReader.readLine();
        Integer nN = Integer.parseInt(sN);
        for (int i=1; i<=nN; i++)
            System.out.println(s);

    }
}
