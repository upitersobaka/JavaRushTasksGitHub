package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread testThread = new TestThread();
        testThread.start();
        Thread.sleep(3000);
        testThread.interrupt();

    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {


        public void run() {

            try {
                Thread current = Thread.currentThread();
                while (!current.isInterrupted()) {
                    System.out.println("Дочерняя нить работает");
                    Thread.sleep(300);
                }
            }
             catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }


    }


}