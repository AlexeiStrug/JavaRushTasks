package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] mass = new int[15];

        int plus = 0;
        int minus = 0;

        for (int i = 0; i < mass.length; i++) {
             mass[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < mass.length; i++) {
           if (i % 2 == 0 )
               plus += mass[i];
            else minus += mass[i];
        }
        if (plus > minus)
            System.out.println("В домах с четными номерами проживает больше жителей.");
         else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
