package com.dataStructure.practice.designpattern.structuralDesignPattern.Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new JalpenoDecorator(new CheeseBurstDecorator(new BasePizza()));

        System.out.println(pizza.bake());
    }
}
