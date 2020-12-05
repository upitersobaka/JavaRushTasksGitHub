package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution {
    public static int A;
    public static int B;





    public static int MIN = min(A, B);

    public static void setAB() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(reader.readLine());
        B = Integer.parseInt(reader.readLine());
    }

    public static void main(String[] args) throws IOException {


        setAB();

        MIN = min(A,B);

        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
