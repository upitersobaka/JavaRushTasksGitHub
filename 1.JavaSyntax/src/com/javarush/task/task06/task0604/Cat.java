package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    public Cat(){
        catCount = catCount+1;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        catCount = catCount - 1;
    }

    public static void main(String[] args) {

    }
}