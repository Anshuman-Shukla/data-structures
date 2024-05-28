package com.dataStructure.practice.designpattern.creationalDesignPattern.factory;

public class AngularDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Angular Developer");
        return 3500;
    }
}
