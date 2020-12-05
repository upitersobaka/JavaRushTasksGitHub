package com.javarush.task.task17.task1706;

/**
 * Created by dovgal on 19.01.2018.
 */
public class Opapa {
    private static Opapa ourInstance = new Opapa();

    public static Opapa getInstance() {
        return ourInstance;
    }

    private Opapa() {
    }
}
