package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("Введите имя файла для чтения");
        String filename1  = reader1.readLine();
        //FileReader freader = new FileReader(reader.readLine());

        // System.out.println("Введите имя файла для записи");
        String fileneme2  = reader1.readLine();

        reader1.close();

        BufferedReader reader = new BufferedReader(new FileReader(filename1));


        BufferedWriter fwriter = new BufferedWriter(new FileWriter(fileneme2));

        String str = "";

        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = reader.read(); //читаем один символ (char будет расширен до int)
            char c = (char) data;
           /* if (c == "."){
               str = str + "!";
            }
            else str = str + c;*/
           if (data == 46){
               str = str + "!";
           }
           else
            str = str + c;
        }

        //str.replaceAll("[.]","!"); // Правильно
        fwriter.write(str);


        reader.close();
        fwriter.close();
    }
}
