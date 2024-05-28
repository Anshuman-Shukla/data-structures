package com.dataStructure.practice.designpattern.creationalDesignPattern.abstractFactory;

public abstract class AbstractFactoryDesign {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
        employee.name();
        Employee employee1 = EmployeeFactory.getEmployee(new WebDevFactory());
        employee1.name();
    }
}
