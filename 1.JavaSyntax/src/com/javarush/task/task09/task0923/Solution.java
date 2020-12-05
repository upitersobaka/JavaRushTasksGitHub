package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String s = reader.readLine();

       String gl="";
       String sg="";

       for (int i=0; i< s.length(); i++){
           if (s.charAt(i) == ' ') continue;

           if (isVowel(s.charAt(i))== true){
               gl = gl + s.charAt(i)+" ";

           }
           else
               sg = sg + s.charAt(i)+ " ";
       }

        System.out.println(gl);
        System.out.println(sg);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}