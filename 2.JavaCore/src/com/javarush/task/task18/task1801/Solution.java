package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream file = new FileInputStream(fileName);

        int data;
        int max = 0;
        while(file.available() > 0) {
            data = file.read();
            if(max < data) {
                max = data;
            }
        }
        file.close();
        System.out.println(max);
    }
}
