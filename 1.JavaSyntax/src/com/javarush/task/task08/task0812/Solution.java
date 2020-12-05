package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max = 1;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(r.readLine()));
        }
        int count = 1;
        for (int i = 1; i < 10; i++) {
            if (list.get(i) ==(list.get(i - 1))) {
                count++;
            }
             else count = 1;
                    if (count > max)
                        max = count;


        }
        System.out.print(max); }

    }
