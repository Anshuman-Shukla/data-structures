package com.dataStructure.practice.designpattern.structuralDesignPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

//Flyweight Factory...
public class CharacterFactory {

    private Map<java.lang.Character,CharacterFlyweight> characters=new HashMap<>();

    public CharacterFlyweight getCharacter(char symbol){

        CharacterFlyweight flyweight= characters.get(symbol);
        if(flyweight==null){
             flyweight = new Character(symbol);
            characters.put(symbol,flyweight);
        }
        return flyweight;
    }
}
