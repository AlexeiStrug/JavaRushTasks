package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String fileName;
            while (!(fileName = reader.readLine()).equals("exit")) {
                ReadThread t = new ReadThread(fileName);
                t.start();
                t.join();
            }

            reader.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<String, Integer> m : resultMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try (FileInputStream fis = new FileInputStream(fileName)) {
                Map<Integer, Integer> map = new TreeMap<>();

                int max = 0;
                int maxByte = 0;
                while (fis.available() > 0) {
                    int readByte = fis.read();
                    map.merge(readByte, 1, Integer::sum);
                    if (map.get(readByte) > max) {
                        max = map.get(readByte);
                        maxByte = readByte;
                    }
                }

                resultMap.put(fileName, maxByte);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
