package com.dataStructure.practice.designpattern.structuralDesignPattern.Adapter;

public class AdapterCharger implements AppleCharger{
    private  AndroidCharger charger;

    public AdapterCharger(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void chargePhone() {
        System.out.println("Adapter is used to charge..");
        charger.chargerAndroid();
    }
}
