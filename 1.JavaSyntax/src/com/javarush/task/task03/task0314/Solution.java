package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {

        int i=1,bd=1,c=0,znac=10;
        String s="";
        while (i<11)
        {
            while (bd<11)
            {

                c = i*bd;
                if (bd>9)
                    s = s + c;
                else
                    s = s + c + " ";
                bd++;
               // scet2 = scet2+1;
            }
            System.out.println(s);
            s="";
            i++;
            bd=1;


        }
    }
}
