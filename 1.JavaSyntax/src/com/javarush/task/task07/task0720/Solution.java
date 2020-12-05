package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n;
        Integer m;
        String s;

        ArrayList<String> list = new ArrayList<String >();

        s = reader.readLine();
        n = Integer.parseInt(s);

        s = reader.readLine();
        m = Integer.parseInt(s);

        for (int i=0; i < n; i++)
            list.add(reader.readLine());

        for (int i=0; i < m; i++){
            s = list.get(0);
            list.remove(0);
            list.add(s);
        }

        for (int i=0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
