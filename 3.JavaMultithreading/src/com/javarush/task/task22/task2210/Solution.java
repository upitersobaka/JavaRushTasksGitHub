package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

        String[] mas = new String[getTokens("level22.lesson13.task01", ".").length];
        mas = getTokens("level22.lesson13.task01", ".");

        for (String str : mas
             ) {
            System.out.println(str);

        }

    }
    public static String [] getTokens(String query, String delimiter) {

        StringTokenizer tokenizer =
                new StringTokenizer(query,delimiter);

       
        ArrayList<String> arrayListString = new ArrayList<>();
        
        int i = 0;

        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();

            arrayListString.add(token);
            

        }

        String[] arrayToken = new String[arrayListString.size()];

        for (String element : arrayListString
             ) {
            arrayToken[i] = element;
            i++;
            
        }

        return arrayToken;
    }
}
