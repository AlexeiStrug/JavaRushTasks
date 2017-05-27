package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.1,"hi");
        labels.put(1.2,"hi1");
        labels.put(1.3,"hi2");
        labels.put(1.4,"hi3");
        labels.put(1.5,"hi4");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
