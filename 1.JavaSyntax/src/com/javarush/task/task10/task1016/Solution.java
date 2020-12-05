package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //напишите тут ваш код

        int i = list.size();
        while  (i>0) {
            int kol = 0;
            ArrayList<String> mas = new ArrayList<>();

            String s = list.get(i-1);

            for (int sz=0; sz<list.size(); sz++) {
                if (s.equals(list.get(sz))) {
                    kol = kol + 1;
                    mas.add(s);
                }
            }

            result.put(s,kol);
            for (int cz =0; cz< mas.size(); cz++) {
                list.remove(s);
            }
            i = list.size();
        }


        return result;
    }

}

