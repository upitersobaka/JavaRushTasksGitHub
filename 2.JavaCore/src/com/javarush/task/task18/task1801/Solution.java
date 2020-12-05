package com.javarush.task.task18.task1801;

import java.io.*;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();


        FileInputStream fileInputStream = new FileInputStream(str);

       // reader.close();

      /*  if (fileInputStream.available()>0) {
            int max = fileInputStream.read();
        }
        else {*/
            int max = 0;
     //   }

       // int maximum = fileInputStream.available()>0 ? fileInputStream.read() : null;

        while (fileInputStream.available()> 0){
          int nextByte = fileInputStream.read();
          if (nextByte > max) max = nextByte;
        }


        fileInputStream.close();
       System.out.println(max);






    }
}
