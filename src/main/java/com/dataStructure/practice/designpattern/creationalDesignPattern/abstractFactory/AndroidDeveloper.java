package com.dataStructure.practice.designpattern.creationalDesignPattern.abstractFactory;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Android Developer Salary");
        return 1000;
    }

    @Override
    public String name() {
        System.out.println("Android Developer NAME");
        return "ANDROID";
    }
}
