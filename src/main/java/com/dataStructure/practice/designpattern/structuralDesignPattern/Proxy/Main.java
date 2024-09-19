package com.dataStructure.practice.designpattern.structuralDesignPattern.Proxy;

public class Main {
    public static void main(String[] args) {
        Account acc=new ATM();
        acc.withDraw();
    }
}
