package com.javarush.task.task21.task2113;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;


    public static Hippodrome game;

    public static void main(String[] args) throws InterruptedException {

        List<Horse> horses1 = new ArrayList<Horse>();
        horses1.add(new Horse("Viva", 3, 0));
        horses1.add(new Horse("La", 3, 0));
        horses1.add(new Horse("Vita", 3, 0));

        game = new Hippodrome(horses1);

        game.run();
        game.printWinner();

    }

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }


    public void run() throws InterruptedException {

        for (int i=0; i<100 ; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){

        for (int i=0; i<horses.size(); i++){
            horses.get(i).move();

        }


    }

    public void print(){
        for (int i=0; i< horses.size(); i++){
            horses.get(i).print();
        }

        for (int i=0; i<11; ++i){
            System.out.println();
        }

    }

    public Horse getWinner(){

        int winnerIndex = 0;
        double winnerDistance = 0;
        List<Horse> listHorses = getHorses();
        for (int i=0; i<listHorses.size(); i++ ){
            if (listHorses.get(i).getDistance()> winnerDistance){
                winnerIndex = i;
                winnerDistance = listHorses.get(i).getDistance();
            }
        }

        return listHorses.get(winnerIndex);
    }

    public void printWinner(){


        System.out.println("Winner is "+ getWinner().getName()+"!");

    }



}
