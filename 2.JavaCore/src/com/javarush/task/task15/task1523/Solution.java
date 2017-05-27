package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public int x , y , z;

     Solution() {
    }

    protected Solution(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private Solution(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public Solution(int x) {

        this.x = x;
    }

    public static void main(String[] args) {

    }
}

