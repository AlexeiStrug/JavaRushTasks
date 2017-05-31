package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fReader = new BufferedReader(new FileReader(reader.readLine()))) {

            String line;
            while ((line = fReader.readLine()) != null) {
                if (line.startsWith(args[0] + "")) {
                    System.out.println(line);
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
