package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sName = bufferedReader.readLine();
        String sY = bufferedReader.readLine();
        String sM = bufferedReader.readLine();
        String sD = bufferedReader.readLine();
        //Integer nY = Integer.parseInt(sY);
        System.out.println("Меня зовут "+sName+".");
        System.out.println("Я родился "+sD+"."+sM+"."+sY);
    }
}
