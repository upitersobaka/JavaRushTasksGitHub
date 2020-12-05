package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();



    public static void setLabels(Map<Double, String> labels) {
      //  Solution.labels = labels;
        labels.put(new Double(3.1),"aaaaa");
        labels.put(new Double(3.2),"bbb");
        labels.put(new Double(3.3),"ccc");
        labels.put(new Double(3.4),"ddd");
        labels.put(new Double(3.5),"eee");
        Solution.labels = labels;
    }



    public static void main(String[] args) {

        setLabels(labels);
      //  for( Map.Entry<Double, String> entry : labels.entrySet() )
        System.out.println(labels);
    }
}
