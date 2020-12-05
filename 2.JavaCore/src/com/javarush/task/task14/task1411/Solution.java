package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        ArrayList<String> dolgn = new ArrayList <String>();
        dolgn.add("user");
        dolgn.add("loser");
        dolgn.add("coder");
        dolgn.add("proger");


                //тут цикл по чтению ключей, пункт 1
                boolean bol = true;
                String str = "";

                 while (bol == true) {

                     str = reader.readLine();

                     if (dolgn.indexOf(str)== -1)
                     {
                        bol = false;
                     //   person = null;
                     }

                     if ("user".equals(str)) {
                          person = new Person.User();
                     }

                     if ("loser".equals(str)) {
                          person = new Person.Loser();
                     }

                     if ("coder".equals(str)) {
                          person = new Person.Coder();
                     }

                     if ("proger".equals(str)) {
                          person = new Person.Proger();
                     }

                     //создаем объект, пункт 2
                     if (bol == true)
                     doWork(person); //вызываем doWork
                 }


        }


    public static void doWork(Person person) {
        // пункт 3

        if (person instanceof Person.User){
           ((Person.User) person).live();
        }

        if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }

        if (person instanceof Person.Coder){
            ((Person.Coder) person).coding();
        }

        if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }

    }
}
