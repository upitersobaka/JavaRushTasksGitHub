package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Integer i,s=1;
        while (s<11)
        {
            i = 1;
            while (i<11)
            {

                if (i==10)
                    System.out.println(s * i);
                else System.out.print(s * i + " ");

                i++;
            }
            s++;
        }

    }
}
