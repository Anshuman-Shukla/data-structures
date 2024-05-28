package com.dataStructure.practice.designpattern.structuralDesignPattern.Decorator;

public class JalpenoDecorator extends PizzaDecorator{

    public JalpenoDecorator(Pizza pizza) {
        super(pizza);
    }
    public String bake(){
        return pizza.bake() + addJalpeno();
    }

    private String addJalpeno() {
        return " Jalpeno Added !";
    }
}
