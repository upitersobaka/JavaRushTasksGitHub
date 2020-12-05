package com.javarush.task.task29.task2909.human;



public class Teacher extends UniversityPerson {



    public Teacher(String name, int age, int numberOfStudents) {
        super(name, age);

    }


    public void live() {
        teach();
    }

    @SuppressWarnings("EmptyMethod")
    public void teach() {
    }

    @Override
    public String getPosition() {
        return "Преподаватель";
    }


    /*public void printData() {
        getPosition();
    }  */
}