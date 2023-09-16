package com.dataStructure.practice.designpattern.abstractFactory;

public class WebDevFactory extends EmplyeeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
