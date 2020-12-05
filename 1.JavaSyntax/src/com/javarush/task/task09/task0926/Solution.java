package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> al = new ArrayList();
        int task[] = {5,2,4,7,0};
        int item[];
        for(int x : task) {
            if(x > 0) {
                item = new int[x];
                for (int y = 0; y < x; y++) {
                    item[y] = y;
                }
            } else item = new int[0];
            al.add(item);
        }
        return al;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
