package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {

    public String name;
    public int id;
    public short zn;

    public static void main(String[] args) {

    }

    public Solution(String name) {
        this.name = name;
    }

    protected Solution(int id) {
        this.id = id;
    }

    private Solution(String name, int id) {
        this.name = name;
        this.id = id;
    }

    Solution(String name, int id, short zn) {
        this.name = name;
        this.id = id;
        this.zn = zn;
    }
}

