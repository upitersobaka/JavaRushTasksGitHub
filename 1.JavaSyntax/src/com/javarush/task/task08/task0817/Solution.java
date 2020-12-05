package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {

    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Петров","Вася");
        map.put("Петровский","Григор");
        map.put("Сидоров","Вася");
        map.put("Обухов","Инан");
        map.put("Гадяч","Вася"); //5
        map.put("Обухов9","Тимур");
        map.put("Винник","Серж");
        map.put("Ляпин4","Костя");
        map.put("Ляпин8","Севой");
        map.put("Петровград","Ваской"); //10

        return  map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

        ArrayList <String> list = new ArrayList<String>();

        HashMap<String, String> copy1 = new HashMap<String, String>(map);
        Integer kol = 0;

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getValue();
            for (Map.Entry<String, String> pair1 : copy1.entrySet()) {
                if (pair1.getValue().equals(key))
                    kol = kol+1;
            }
            if (kol>1)
                list.add(key);
            kol = 0;

        }

        for (int i=0; i<list.size(); i++) {
            removeItemFromMapByValue(map, list.get(i));
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

      /*  HashMap<String,String> map1 = createMap();
        removeTheFirstNameDuplicates(map1);
        for (Map.Entry<String, String> pair : map1.entrySet()) {
            String key1 = pair.getKey();
            String value1 = pair.getValue();
            System.out.println(key1 + "  " + value1);
        }*/

    }
}
