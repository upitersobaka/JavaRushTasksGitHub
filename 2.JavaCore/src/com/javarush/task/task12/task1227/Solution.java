package com.javarush.task.task12.task1227;

/* 
Fly, Run, Swim для классов Duck, Penguin, Toad
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        void fly();
    }

    public interface Run {
        void run();
    }

    public interface Swim {
        void swim();
    }

    public class Duck implements Fly, Run, Swim{
        public void swim(){

        }
        public void run(){

        }
        public void fly(){

        }
    }

    public class Penguin implements Run, Swim{

        public void run(){

        }
        public void swim(){

        }
    }

    public class Toad implements Swim {
        public void swim(){

        }
    }
}
