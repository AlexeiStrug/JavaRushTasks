package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while (true) {
            key = reader.readLine();
            if ("user".equals(key) || "loser".equals(key) || "coder".equals(key) || "proger".equals(key)) {

                // /создаем объект, пункт 2
                if (key == "user") {
                    person = new Person.User();
                } else if (key == "looser") {
                    person = new Person.Loser();
                } else if (key == "coder") {
                    person = new Person.Coder();
                } else {
                    person = new Person.Proger();
                }

                doWork(person); //вызываем doWork
            } else {
                break;
            }

        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        }
        if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        }
        if (person instanceof Person.Coder) {
            ((Person.Coder) person).coding();
        }
        if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
