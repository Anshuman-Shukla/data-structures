package com.dataStructure.practice.designpattern.creationalDesignPattern.factory;

public class JavaDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Java Developer!!");
        return 3000;
    }
}
