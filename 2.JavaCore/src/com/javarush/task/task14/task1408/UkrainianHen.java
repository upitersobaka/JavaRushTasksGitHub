package com.javarush.task.task14.task1408;

/**
 * Created by dovgal on 14.11.2017.
 */
public class UkrainianHen extends Hen {

    public String getDescription() {

        return super.getDescription()+" Моя страна - "+Country.UKRAINE +". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }

    int getCountOfEggsPerMonth(){

        int col = 8;
        return col;
    }
}
