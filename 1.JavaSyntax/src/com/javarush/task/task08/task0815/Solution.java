package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap list = new HashMap();
        for (int i = 0; i<10; i++) {
            list.put("KEY"+i, "VALUE"+i);
        }
        return list;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int a = 0;
        for (HashMap.Entry b : map.entrySet()){
            if(b.getValue().equals(name)){
                a++;
            }
        }
        return a;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int a = 0;
        for (HashMap.Entry b : map.entrySet()){
            if(b.getKey().equals(lastName)){
                a++;
            }
        }
        return a;

    }

    public static void main(String[] args) {

    }
}
