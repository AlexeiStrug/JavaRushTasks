package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public class Cat implements Climb,Run {
        public Cat() {
            super();
        }

        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public class Dog implements Run {
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat{
        @Override
        public void climb() {
            super.climb();
        }

        @Override
        public void run() {
            super.run();
        }
    }

    public class Duck implements Run,Fly{
        public Duck() {
            super();
        }

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }

    public interface  Fly {
        void fly();
    }
    public interface  Climb {
        void climb();
    }
    public interface  Run {
        void run();
    }
}
