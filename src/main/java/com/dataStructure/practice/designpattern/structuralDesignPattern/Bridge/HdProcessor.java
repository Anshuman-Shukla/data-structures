package com.dataStructure.practice.designpattern.structuralDesignPattern.Bridge;

public class HdProcessor implements VideoProcessor{
    @Override
    public void process(String file) {
        System.out.println("HD VIDEO IS PLAYING!!!");
    }
}
