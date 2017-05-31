package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileOutputStream outputStream = new FileOutputStream(fileName1);
        FileInputStream inputStream1 = new FileInputStream(fileName2);
        FileInputStream inputStream2 = new FileInputStream(fileName3);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        while (inputStream1.available() > 0){
            int count = inputStream1.read();
            list1.add(count);
        }
        while (inputStream2.available() > 0){
            int count = inputStream2.read();
            list2.add(count);
        }

        for (int i = 0; i < list1.size(); i++) {
            outputStream.write(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            outputStream.write(list2.get(i));
        }

        outputStream.close();
        inputStream1.close();
        inputStream2.close();
    }
}
