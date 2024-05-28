package com.dataStructure.practice.designpattern.structuralDesignPattern.Adapter;

public class Iphone14 {

    private AppleCharger charger;

    public Iphone14(AppleCharger charger) {
        this.charger = charger;
    }

    public  void  chargeIphone(){
        System.out.println("Iphone14 charge Class..");
        charger.chargePhone();
    }
}
