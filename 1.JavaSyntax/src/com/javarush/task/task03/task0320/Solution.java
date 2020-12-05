package com.javarush.task.task03.task0320;


/* 
Скромность украшает программиста
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      //  System.out.println("Введите имя;");//напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sName = bufferedReader.readLine();
        System.out.println(sName+ " зарабатывает $5,000. Ха-ха-ха!");
    }
}
