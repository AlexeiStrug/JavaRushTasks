package com.javarush.task.task16.task1632;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                while (!isInterrupted()) {
                }
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (Exception e) {
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        public void showWarning() {
            this.interrupt();
            try {
                this.join();
            } catch (InterruptedException e) {

            }
        }

        public void run() {
            while (!isInterrupted()) {

            }
        }
    }
 public static class Thread5 extends Thread {
     @Override
     public void run() {
         String input;
         int sum = 0;
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         try {
             while(!(input = reader.readLine()).equals("N")) {
                 sum += Integer.parseInt(input);
             }
         } catch (Exception e) {

         }
         System.out.println(sum);
     }
 }
    public static void main(String[] args) {
    }
}