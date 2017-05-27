package com.javarush.task.task15.task1522;

/**
 * Created by Alex on 27.05.2017.
 */
public class Sun implements Planet {
    private static  Sun instance;

    //to prevent creating another instance of Singleton
    private Sun(){}

    public static Sun getInstance(){
        if(instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}
