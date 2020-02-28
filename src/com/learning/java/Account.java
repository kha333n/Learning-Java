package com.learning.java;

public class Account
{
    private double balance;
    public Account(double initialValue)
    {
        if (initialValue > 0.0)
            balance = initialValue;
    }
    public void credit(double amount)
    {
        balance = balance + amount;
    }
    public double getBalance(){
        return balance;
    }
}
