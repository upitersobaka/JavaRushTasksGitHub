package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
       // int[] arraySort = new int[array.length];
        int i = 0;
        while(i < array.length){
            //ищем максимальный элемент
            int position = i;
            int max = array[i];
            for(int j = i; j < array.length; j++)
                if(array[j] > max) {
                max = array[j];
                position = j;
                //запоминаем позицию
                }
               // array[position] = Integer.MIN_VALUE;
               array[position] = array[i]; // меняем в  масиве
               array[i] = max;
            //"обнуляем" элемент //set
            //arraySort[i] = max;
            //присваеваем новое значение arraySort
            i++;
        }
        //переносим из arraySort в array
       // for(int k = 0; k < arraySort.length; k++)
      //      array[k] = arraySort[k];
    }
}
