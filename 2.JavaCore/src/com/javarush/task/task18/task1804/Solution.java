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
        String fileName = reader.readLine();
        FileInputStream file = new FileInputStream(fileName);

        HashMap<Integer, Integer> mapOfByte = new HashMap<Integer, Integer>();

        int data = 0;
        Integer count = 0;
        while (file.available() > 0) {
            data = file.read();

            count = mapOfByte.get(data);
            if (count != null) {
                count++;
            } else
                count = 0;
            mapOfByte.put(data, count);
        }
        file.close();

        boolean first = true;
        int min = 0;
        for (int amountByte : mapOfByte.values()) {
            if (first) {
                min = amountByte;
                first = false;
            }
            if (min > amountByte)
                min = amountByte;
        }

        //Выводим
        for (Map.Entry pair : mapOfByte.entrySet()) {
            if (min == (int) pair.getValue())
                System.out.print(" " + pair.getKey());
        }
    }
}

