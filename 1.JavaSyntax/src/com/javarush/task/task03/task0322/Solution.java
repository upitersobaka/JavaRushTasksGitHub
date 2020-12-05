package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sName1 = bufferedReader.readLine();
        String sName2 = bufferedReader.readLine();
        String sName3 = bufferedReader.readLine();
        System.out.println(sName1+" + "+sName2+" + "+sName3+" = Чистая любовь, да-да!");
    }
}