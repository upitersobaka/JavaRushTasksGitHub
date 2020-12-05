package com.javarush.task.task15.task1520;

/**
 * Created by dovgal on 09.01.2018.
 */
public class Moon {
    private static Moon ourInstance = new Moon();

    public static Moon getInstance() {
        return ourInstance;
    }

    private Moon() {
    }
}
