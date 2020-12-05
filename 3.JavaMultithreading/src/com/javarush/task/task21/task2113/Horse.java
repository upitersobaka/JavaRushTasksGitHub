package com.javarush.task.task21.task2113;

public class Horse {
   private String name;
   private double speed;
   private double distance;


    public Horse(String name, double speed ,double distance) {
        this.name = name;
        this.distance = distance;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void move (){

        double horseSpeed    = getSpeed();
        double horseDistance = getDistance();
        setDistance(horseDistance+=horseSpeed * Math.random());
    }

    public void print(){

        int intDistance = (int) getDistance();
        StringBuilder buffer = new StringBuilder(""); // ""
        for (int i = 0; i<intDistance; i++){
            buffer.append(".");
        }
        buffer.append(getName());
        System.out.println(buffer);


    }

}
