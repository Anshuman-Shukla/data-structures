package com.dataStructure.practice.designpattern.abstractFactory;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Web Developer Salary");
        return 1000;
    }

    @Override
    public String name() {
        System.out.println("Web Developer NAME");
        return "WEB Developer";
    }
}
