package com.dataStructure.practice.designpattern.creationalDesignPattern.abstractFactory;

public class WebDevFactory extends EmplyeeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
