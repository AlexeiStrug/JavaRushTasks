package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> map = new HashMap<>();

        while (true) {
            String cityName = reader.readLine();
            if (cityName.isEmpty()) break;
            String family = reader.readLine();
            map.put(cityName, family);
        }

        String cityName = reader.readLine();
        String familySecondName = map.get(cityName);
        System.out.println(familySecondName);

    }
}
