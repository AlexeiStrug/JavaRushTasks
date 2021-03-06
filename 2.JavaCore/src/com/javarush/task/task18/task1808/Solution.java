package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream1 = new FileOutputStream(fileName2);
        FileOutputStream outputStream2 = new FileOutputStream(fileName3);


        ArrayList<Integer> list = new ArrayList<>();

        while (inputStream.available() > 0){
            int count = inputStream.read();
            list.add(count);
        }

        if(list.size()%2 == 0){
            for (int i = 0; i < list.size()/2; i++){
                outputStream1.write(list.get(i));
            }

            for (int i = list.size()/2; i < list.size(); i++){
                outputStream2.write(list.get(i));
            }
        }

        else{
            for (int i = 0; i <= (list.size()-1)/2; i++){
                outputStream1.write(list.get(i));
            }

            for (int i = (list.size()-1)/2 + 1; i < list.size(); i++){
                outputStream2.write(list.get(i));
            }
        }
        reader.close();
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
