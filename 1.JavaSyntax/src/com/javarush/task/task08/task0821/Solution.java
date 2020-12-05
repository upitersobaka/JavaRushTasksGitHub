package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> newmap = new HashMap<String, String>();
        newmap.put("Долдон","Петя");
        newmap.put("Долдон2","Петя2");
        newmap.put("Долдон3","Петя3");
        newmap.put("Долдон","Петя4");
        newmap.put("Долдон","Петя5");
        newmap.put("Долдон6","Петя");
        newmap.put("Долдон7","Петя8");
        newmap.put("Долдон8","Петя");
        newmap.put("Долдон","Петя");
        newmap.put("Долдон45","Петя12");


        return newmap;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
