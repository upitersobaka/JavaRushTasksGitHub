package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top;
    private int left;
    private int width=0;
    private int height=0;

    public void initialize(int top, int left, int width, int height){
        this.top   = top;
        this.left  = left;
        this.width = width;
        this.height=height;
    }

    public void initialize(int top, int left){
        this.top   = top;
        this.left  = left;

    }

    public void initialize(int top, int left, int width){
        this.top   = top;
        this.left  = left;
        this.width = width;
        this.height= width;
    }

    public void initialize(Rectangle rectangle){
        this.top   = rectangle.top;
        this.left  = rectangle.left;
        this.width = rectangle.width;
        this.height= rectangle.width;
    }

    public static void main(String[] args) {

    }
}
