package com.javarush.task.task14.task1408;

/**
 * Created by dovgal on 14.11.2017.
 */
public class RussianHen extends Hen {

    @Override
    public String getDescription() {

        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    int getCountOfEggsPerMonth(){

        int col = 7;
        return col;
    }
}