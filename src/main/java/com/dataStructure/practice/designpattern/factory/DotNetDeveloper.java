package com.dataStructure.practice.designpattern.factory;

public class DotNetDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Dot Net Developer");
        return 4000;
    }
}
