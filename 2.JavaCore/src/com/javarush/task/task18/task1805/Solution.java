package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream file = new FileInputStream(fileName);

        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        while (file.available()>0)
        {
            Integer k = file.read();
            treeMap.put(k, 1);
        }

        for (Map.Entry e : treeMap.entrySet())
        {
            System.out.print(e.getKey()+" ");
        }
        file.close();
    }
}
