package com.dataStructure.practice.designpattern.factory;

public class FactoryDesign {
    public static void main(String[] args) {
        Employee java = EmployeeFactory.getInstanceOfDeveloper("NET");
        System.out.println(java.salary());
    }
}
