package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

      FileInputStream inputStream = new FileInputStream(fileName);

        while (inputStream.available() > 0){

            System.out.write(inputStream.read());
        }

        inputStream.close();



       /* Scanner diskScanner = new Scanner(new File(fileName));
        while (diskScanner.hasNextLine()) {
            System.out.println(diskScanner.nextLine());
        }
         diskScanner.close();


       */


        reader.close();

    }
}