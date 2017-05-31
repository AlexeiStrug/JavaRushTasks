package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileReader;

public class Solution {
    public static void main(String[] args) throws Exception{

        FileReader f = new FileReader(args[0]);

        int countP = 0;
        int countS = 0;
        while (f.ready()) {
            char ch = (char) f.read();
            countS++;
            if (ch == ' ')
                countP++;

        }
        f.close();

        System.out.println(String.format("%.2f", ((float) countP / countS) * 100));
    }
}
