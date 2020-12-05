package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();

        Date currDate = new Date();

        insert10000(arrayList);

        Date currDate2 = new Date();
        timego(currDate,currDate2);


        get10000(arrayList);

        Date currDate3 = new Date();
        timego(currDate2,currDate3);

        set10000(arrayList);

        Date currDate4 = new Date();
        timego(currDate3,currDate4);


        remove10000(arrayList);

        Date currDate5 = new Date();
        timego(currDate4,currDate5);

        // LinkedList
        LinkedList linkedList = new LinkedList();



        insert10000(linkedList);

        Date currDate6 = new Date();
        timego(currDate5,currDate6);


        get10000(linkedList);

        Date currDate7 = new Date();
        timego(currDate6,currDate7);


        set10000(linkedList);
        Date currDate8 = new Date();
        timego(currDate7,currDate8);

        remove10000(linkedList);

        Date currDate9 = new Date();
        timego(currDate8,currDate9);
    }

    public static void insert10000(List list) {

        for (int i=0; i < 10000 ; i++) {
            list.add(0,i);
        }

    }

    public static void get10000(List list) {

        for (int i=0; i < 10000 ; i++) {
            list.get(i);
        }

    }

    public static void set10000(List list) {

        for (int i=0; i < 10000 ; i++) {
            list.set(i, i);
        }

    }

    public static void remove10000(List list) {

        for (int i=0; i < 10000 ; i++) {
            list.remove(0);
        }

    }

    public static void timego(Date data1, Date data2) {

        long ms1 = data1.getTime();

        long ms2 = data2.getTime();

        long result = ms2 - ms1;

        System.out.println("Времени понадобилось " + result);



    }
}
