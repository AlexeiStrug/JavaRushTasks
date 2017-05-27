package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) throws Exception {

    }
    
    static {

      reset();

    }

    public static Flyable result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
            input = reader.readLine();
            if(input.equals("helicopter")) {
                result = new Helicopter();
            }
            if(input.equals("plane")){
                int pCount = Integer.parseInt(reader.readLine());
                result = new Plane(pCount);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
