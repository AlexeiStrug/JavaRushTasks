package com.javarush.task.task15.task1522;


/**
 * Created by Alex on 27.05.2017.
 */
public class Earth implements Planet{

    private static Earth instance;

    //to prevent creating another instance of Singleton
    private Earth(){}

    public static Earth getInstance(){
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
