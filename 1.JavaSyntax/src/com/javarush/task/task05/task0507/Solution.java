package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 0;
        double sum = 0;
        Scanner in = new Scanner(System.in);
        for (; ; ) {
            int a = in.nextInt();
            if (a != -1) {
                sum += a;
                i++;
            } else break;
        }
        System.out.print(sum / i);
    }
}

