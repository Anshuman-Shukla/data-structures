package com.dataStructure.practice.designpattern.structuralDesignPattern.Flyweight;

public class Main {
    public static void main(String[] args) {

        CharacterFactory factory=new CharacterFactory();
        CharacterFlyweight charA = factory.getCharacter('A');
        CharacterFlyweight charA1 = factory.getCharacter('A');
        CharacterFlyweight charB = factory.getCharacter('B');
        CharacterFlyweight charC = factory.getCharacter('C');

        charA.display(10,"RED");
        charA1.display(12,"BLUE");
        charB.display(15,"GREEN");
        charC.display(100,"YELLOW");

        System.out.println("CharA and CharA1 are same: "+(charA==charA1));




    }
}
