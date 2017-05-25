package com.javarush.task.task13.task1319;

import java.io.*;



public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter write = new BufferedWriter(new FileWriter(in.readLine()));

        String s;

        while (!(s = in.readLine()).equals("exit")){
            write.append(s);
            write.newLine();
        }
        write.append("exit");
        write.close();
    }
}
