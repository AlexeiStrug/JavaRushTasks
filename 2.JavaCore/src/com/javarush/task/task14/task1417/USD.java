package com.javarush.task.task14.task1417;

/**
 * Created by Alex on 26.05.2017.
 */
public class USD extends Money{
    public USD(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
