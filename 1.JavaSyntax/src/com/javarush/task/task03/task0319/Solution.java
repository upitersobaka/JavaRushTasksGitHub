package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import javax.sound.midi.Soundbank;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sName = bufferedReader.readLine();//напишите тут ваш код
        String sNumber1 = bufferedReader.readLine();
        String sNumber2 = bufferedReader.readLine();
        Integer nNumber1 = Integer.parseInt(sNumber1);
        Integer nNumber2 = Integer.parseInt(sNumber2);
        System.out.println(sName+" получает "+nNumber1+" через "+nNumber2+" лет.");

    }
}
