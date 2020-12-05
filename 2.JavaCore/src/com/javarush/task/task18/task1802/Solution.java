package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(str);

        int min = 256;

        while (fileInputStream.available()> 0){
            int nextByte = fileInputStream.read();
            if (nextByte < min) min = nextByte;
        }


        fileInputStream.close();
        System.out.println(min);
    }
}
