package com.javarush.task.task15.task1529;

/**
 * Created by dovgal on 10.01.2018.
 */
public class Plane implements Flyable {

    private int pasAmount = 0;

    @Override
    public void fly() {

    }

    public Plane(int pasAmount) {
        this.pasAmount = pasAmount;
    }
}
