package com.dataStructure.practice.designpattern.structuralDesignPattern.Decorator;

public class BasePizza implements Pizza{

    @Override
    public String bake() {
        return " Base of the Pizza !";
    }
}
