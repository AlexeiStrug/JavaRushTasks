package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }


    public class Human implements Run,Swim{
        public Human() {
            super();
        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Duck implements Run,Swim, Fly{
        public Duck() {
            super();
        }

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Penguin implements Run,Swim{
        public Penguin() {
            super();
        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Airplane implements Run,Fly {
        public Airplane() {
            super();
        }

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}