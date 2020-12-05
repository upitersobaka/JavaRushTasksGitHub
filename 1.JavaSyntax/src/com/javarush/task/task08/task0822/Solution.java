package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

        Integer min = array.get(0);

        for (int i=0; i<array.size(); i++){
            if (min>array.get(i)){
                min = array.get(i);
            }
        }

        // find minimum here — найти минимум тут
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {

        List <Integer> intList = new ArrayList<Integer>();
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        Integer kol = Integer.parseInt(bis.readLine());

        for (int i=0; i<kol; i++){
            Integer val = Integer.parseInt(bis.readLine());
            intList.add(val);
        }

        return intList;
    }
}
