package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        Iterator iterator = cats.iterator();
        cats.remove(iterator.next());




        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set setCat = new HashSet();

        Cat vaska = new Cat();
        vaska.name = "Васька";
        setCat.add(vaska);

        Cat vaska1 = new Cat();
        vaska1.name = "Васька1";
        setCat.add(vaska1);

        Cat vaska2 = new Cat();
        vaska2.name = "Васька2";
        setCat.add(vaska2);

        return setCat;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
     /*   Iterator iterator = cats.iterator();
        while (iterator.hasNext())
        {
          //  String text = iterator.next();
           // System.out.println(iterator.next());
        }*/
      for (Cat cat : cats){
          System.out.println(cat);
      }
    }

    // step 1 - пункт 1
    public static class Cat{
          public String name;
    }
}
