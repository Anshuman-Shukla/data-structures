package com.dataStructure.practice.designpattern.structuralDesignPattern.Bridge;

public class UHDProcessor implements VideoProcessor{
    @Override
    public void process(String file) {
        System.out.println("UHD PROCESSOR is Playing!!");
    }
}
