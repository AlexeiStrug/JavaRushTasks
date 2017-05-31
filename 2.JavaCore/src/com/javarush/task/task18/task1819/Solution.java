package com.javarush.task.task18.task1819;

/* 
Объединение файлов
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

        FileInputStream inputStream1 = new FileInputStream(fileName1);
        FileOutputStream outputStream1 = new FileOutputStream(fileName1);
        FileInputStream inputStream2 = new FileInputStream(fileName2);



        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream2.available() > 0){
            int second = inputStream2.read();
            list.add(second);
        }
        while (inputStream1.available() > 0){
            int first = inputStream1.read();
            list.add(first);
        }


        for (int i = 0; i < list.size(); i++) {
            outputStream1.write(list.get(i));
        }
        inputStream1.close();
        inputStream2.close();
        outputStream1.close();
    }
}
