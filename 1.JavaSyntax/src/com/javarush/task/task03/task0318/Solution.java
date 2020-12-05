package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
     //   System.out.println("Введите через сколько лет захватят мир:");//напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sAge = bufferedReader.readLine();
        Integer nAge = Integer.parseInt(sAge);
       // System.out.println("Кто захватит мир. Введите имя:");
        String name = bufferedReader.readLine();
        System.out.println(name+" захватит мир через "+nAge+" лет. Му-ха-ха!");
            }
}
