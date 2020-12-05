package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        Integer nHour = seconds/3600;
        Integer nSecondsLastHour = seconds - (nHour*3600);
        return nSecondsLastHour;
    }
}