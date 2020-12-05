package com.javarush.task.task22.task2202;

import java.util.ArrayList;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args)  {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString (String string)  {

        int[] listProbel = new int[5];
        int probelFind = 0;

        if (string == null){
            throw new TooShortStringException();
        }

        if (string.isEmpty()){
            throw new TooShortStringException();
        }

        for (int i=0 ; i<5; i++ ){
            probelFind = string.indexOf(" ",probelFind);
            if (probelFind != -1) {
                listProbel[i] = probelFind;

            }
            else {
                listProbel[i] = 0;
            }
            probelFind +=1;
        }

        if (listProbel[3]==0){
            throw new TooShortStringException();
        }

        int indEnd = listProbel[4]==0 ? 0 : listProbel[4];
        String result = "";

        if (indEnd == 0){
            result = string.substring(listProbel[0] + 1);
        }

        else {
            result = string.substring(listProbel[0] + 1, listProbel[4]);
        }

        return result;
    }


    public static class TooShortStringException extends RuntimeException {
    }

}
