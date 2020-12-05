package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<>();
        map.put( "Murka", new Cat( "Murka" ) );
        map.put( "Murzik", new Cat( "Murzik" ) );
        map.put( "Vaska", new Cat( "Vaska" ) );
        map.put( "Pushok", new Cat( "Pushok" ) );
        map.put( "Bobik", new Cat( "Bobik" ) );
        map.put( "Zhuchka", new Cat( "Zhuchka" ) );
        map.put( "Koteg", new Cat( "Koteg" ) );
        map.put( "Dymka", new Cat( "Dymka" ) );
        map.put( "Dymka1", new Cat( "Dymka1" ) );
        map.put( "Dymka2", new Cat( "Dymka2" ) );
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet set = new HashSet();
        for(Map.Entry s : map.entrySet()){
            set.add(s.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat.toString());
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
