package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String str2 = reader.readLine();
        String str3 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(str2);

        FileOutputStream outputStream = new FileOutputStream(str);


        if (fileInputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[fileInputStream.available()];
            int count = fileInputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        fileInputStream.close();

        FileInputStream fileInputStream2 = new FileInputStream(str3);

        if (fileInputStream2.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[fileInputStream2.available()];
            int count = fileInputStream2.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        fileInputStream.close();
        fileInputStream2.close();
        outputStream.close();

    }
}
