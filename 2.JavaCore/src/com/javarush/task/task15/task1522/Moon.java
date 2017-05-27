package com.javarush.task.task15.task1522;

/**
 * Created by Alex on 27.05.2017.
 */
public class Moon implements Planet{
    private static Moon instance;

    //to prevent creating another instance of Singleton
    private Moon(){}

    public static Moon getInstance(){
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }
}
