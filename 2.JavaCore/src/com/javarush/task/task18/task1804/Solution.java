package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(str);

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();



        while (fileInputStream.available()> 0){
            int nextByte = fileInputStream.read();
            if (map.containsKey(nextByte)){
                int value = map.get(nextByte);
                map.remove(nextByte);
                map.put(nextByte, value+1);
            }
            else {
                map.put(nextByte,1);
            }


        }

        int min = 999999;
        for (Map.Entry<Integer,Integer> pair : map.entrySet()){

            int val = pair.getValue();
            if (val < min) min = val;
        }




        fileInputStream.close();

        for (Map.Entry<Integer,Integer> pair : map.entrySet()) {
            //  int val2 = pair.getValue();
            if (pair.getValue() == min) System.out.print(pair.getKey()+" ");
        }

    }
}
