package com.dataStructure.practice.designpattern.abstractFactory;

public class AndroidDevFactory extends EmplyeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
