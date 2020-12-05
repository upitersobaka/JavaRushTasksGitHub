package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        Writer writer = new BufferedWriter(new FileWriter(fileName));

        boolean bol = true;

        while (bol == true)
        {
            String str1 = reader.readLine();

            writer.append(str1 + "\r\n");

            if (str1.equals("exit")) {
                bol = false;
            }


        }


        writer.close();
        reader.close();


    }
}
