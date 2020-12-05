package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код


        char[] letter = s.toCharArray();
        for (int i = 0; i < letter.length; i++)
            if (Character.isAlphabetic(letter[i]) && (i == 0 || letter[i - 1] == ' '))
                letter[i] = Character.toUpperCase(letter[i]);
        System.out.println(letter);

    }
}
