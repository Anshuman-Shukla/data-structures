package com.dataStructure.practice.designpattern.structuralDesignPattern.Proxy;

public class ATM implements Account{

    @Override
    public void withDraw() {
        //we can do the validation .Here we are using BankAccount Proxy to get the details
        BankAccount account=new BankAccount();
        System.out.println("With Draw using ATM");
    }

    @Override
    public void getAccount() {

    }
}
