package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stall", new Date("May 4 1984"));
        map.put("Sta", new Date("JUNE 1 1980"));
        map.put("Stal1", new Date("JUNE 1 1980"));
        map.put("Stall2", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("February 1 1980"));
        map.put("Stallone4", new Date("JUNE 6 1980"));
        map.put("Stallone5", new Date("JUNE 9 1980"));
        map.put("Stallone6", new Date("September 6 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        return map;
    }


    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код



        Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                HashMap.Entry pair = (HashMap.Entry)
                it.next();
                Date d = (Date) pair.getValue();
                if ((d.getMonth() > 5) && (d.getMonth() < 9))
                    it.remove();
        }
    }

    public static void main(String[] args) {

    }
}
