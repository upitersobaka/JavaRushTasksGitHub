package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("Петров",356);
        map.put("Петровский",567);
        map.put("Сидоров",436);
        map.put("Обухов",500);
        map.put("Гадяч",7896); //5
        map.put("Обухов9",45);
        map.put("Винник",4563);
        map.put("Ляпин4",43);
        map.put("Ляпин8",-45);
        map.put("Петровград",580); //10

        return  map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue()< 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}