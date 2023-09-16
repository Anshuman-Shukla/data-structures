package com.dataStructure.practice.designpattern.prototypePattern;

public class PrototypeDesignPattern {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        System.out.println("Creating Prototype!!!");
        NetworkConnection connection1 = new NetworkConnection();
        connection1.setIp("10.22.33.22");
        connection1.loadImportantData();
        System.out.println(connection1.toString());
        NetworkConnection clone = (NetworkConnection)connection1.clone();
        System.out.println("After cloning!!");
        System.out.println(clone.toString());
    }
}
