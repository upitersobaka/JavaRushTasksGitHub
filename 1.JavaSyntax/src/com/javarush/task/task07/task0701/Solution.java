package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] arr = new int[20];// создай и заполни массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String  cNum;

        for (int i=0; i< arr.length ; i++) {
            cNum = reader.readLine();
            arr[i] = Integer.parseInt(cNum);

        }
        return arr;
    }

    public static int max(int[] array) {
        int maxim = array[0];
        for (int i = 0; i<array.length; i++)
            if (array[i]> maxim)
                maxim = array[i];
        return maxim;
    }
}
