package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем Singleton pattern
*/

public class Solution {
    public static void main(String[] args) {

    }


    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void readKeyFromConsoleAndInitPlanet() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        if (input.equals(Planet.EARTH) || input.equals(Planet.MOON) || input.equals(Planet.SUN)) {
            if (input.equals(Planet.MOON)) {
                thePlanet = Moon.getInstance();
            }
            if (input.equals(Planet.SUN)) {
                thePlanet = Sun.getInstance();
            }
            if (input.equals(Planet.EARTH)) {
                thePlanet = Earth.getInstance();

            }
        } else thePlanet = null;
    }
}
