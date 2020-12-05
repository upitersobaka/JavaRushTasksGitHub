package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //String sAge = bufferedReader.readLine();
        Integer suma = 0,nN;
        String sN;
        boolean isExit = false;
        while (!isExit){
            sN = bufferedReader.readLine();
            nN = Integer.parseInt(sN);
            suma = suma+nN;
            if (nN==-1)
                isExit = true;
        }

        System.out.println(suma);

    }
}
