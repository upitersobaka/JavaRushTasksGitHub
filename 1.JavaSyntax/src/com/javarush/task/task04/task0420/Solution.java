package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sA1 = bufferedReader.readLine();
        String sA2 = bufferedReader.readLine();
        String sA3 = bufferedReader.readLine();
        Integer nA1 = Integer.parseInt(sA1);
        Integer nA2 = Integer.parseInt(sA2);
        Integer nA3 = Integer.parseInt(sA3);

        if (nA1>=nA2 && nA1>=nA3){
            if (nA2 > nA3)
                System.out.println(nA1+" "+nA2+" "+nA3);
            else
                System.out.println(nA1+" "+nA3+" "+nA2);
        }

        else if (nA2>=nA1 && nA2>=nA3)
            if (nA1 > nA3)
                System.out.println(nA2+" "+nA1+" "+nA3);
            else
                System.out.println(nA2+" "+nA3+" "+nA1);

        else if (nA3 >=nA1 && nA3>=nA2)
            if (nA2 > nA1)
                System.out.println(nA3+" "+nA2+" "+nA1);
            else
                System.out.println(nA3+" "+nA1+" "+nA2);



    }

    public static int abc(int a, int b){
        if ( a > b)
            return a;
        else
            return b;

    }
}
