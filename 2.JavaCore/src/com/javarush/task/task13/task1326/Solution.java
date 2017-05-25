package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = reader.readLine();
        InputStream inStream = new FileInputStream(read);
        ArrayList list = new ArrayList();           //список цифр, которые мы потом будем сортировать, сортировать будем через list.remove, если нечет
        StringBuilder stringBuilder = new StringBuilder();          //для пришивания
        while(inStream.available() > 0)         //вызываем по одному байту из файла
        {
            int data = inStream.read();         //читаем один байт
            char data1 = (char) data;           //переводим его в char, можно пришивать
            stringBuilder.append(data1);
        }
        String a = (stringBuilder.toString());
        StringTokenizer st = new StringTokenizer(a, " \t\n\r,.");
        while (st.hasMoreTokens())
        {
            list.add(Integer.parseInt(st.nextToken()));
        }
        int[] array = new int[list.size()];
        int i = 0;
        for (Object text : list)
        {
            array[i] = (int) text;
            i++;
        }
        Arrays.sort(array);
        for (i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0)
            {
                System.out.println(array[i]);
            }
        }
        reader.close();
        inStream.close();

    }
}

