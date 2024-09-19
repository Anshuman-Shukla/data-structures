package com.dataStructure.practice.designpattern.structuralDesignPattern.Flyweight;
//concrete Flyweight
public class Character implements CharacterFlyweight{

    private char symbol;

    public Character(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void display(int fontSize, String colour) {
        System.out.println("Character:: "+symbol+ " Font Size: "+fontSize+" Colour: "+colour);
    }
}
