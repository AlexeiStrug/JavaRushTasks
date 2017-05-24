package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int id = 0;
        String name = null;

        HashMap<String, Integer> map = new HashMap<>();
        try {
            do {
                id = Integer.parseInt(reader.readLine());
                name = reader.readLine();
                map.put(name, id);
            } while (!name.equals(""));
        } catch (Exception e) {

        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
