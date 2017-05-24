package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String monthName = reader.readLine();

        Map <String, Integer> mapMouth = new HashMap<>();
        mapMouth.put("January", 1);
        mapMouth.put("February", 2);
        mapMouth.put("March", 3);
        mapMouth.put("April", 4);
        mapMouth.put("May", 5);
        mapMouth.put("June", 6);
        mapMouth.put("July", 7);
        mapMouth.put("August", 8);
        mapMouth.put("September", 9);
        mapMouth.put("October", 10);
        mapMouth.put("November", 11);
        mapMouth.put("December", 12);

        for (Map.Entry<String, Integer> pair : mapMouth.entrySet()){
            if(pair.getKey().contains(monthName)){
                System.out.println(monthName + " is " + pair.getValue() + " month");
            }
        }

    }
}
