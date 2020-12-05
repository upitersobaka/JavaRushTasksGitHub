package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {

        int[] listProbel = new int[2];
        int probelFind = 0;

        if (string == null){
            throw new TooShortStringException();
        }

        if (string.isEmpty()){
            throw new TooShortStringException();
        }

        for (int i=0 ; i<2; i++ ){
            probelFind = string.indexOf("\t",probelFind);
            if (probelFind != -1) {
                listProbel[i] = probelFind;

            }
            else {
                listProbel[i] = 0;
            }
            probelFind +=1;
        }

        if (listProbel[1]==0){
            throw new TooShortStringException();
        }

        int indEnd = listProbel[1]==0 ? 0 : listProbel[1];
        String result = "";

        if (indEnd == 0){
            result = string.substring(listProbel[0] + 1);
        }

        else {
            result = string.substring(listProbel[0] + 1, listProbel[1]);
        }

        return result;

    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
