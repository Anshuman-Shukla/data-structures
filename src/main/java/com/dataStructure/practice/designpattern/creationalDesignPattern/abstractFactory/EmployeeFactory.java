package com.dataStructure.practice.designpattern.creationalDesignPattern.abstractFactory;

public class EmployeeFactory {
    public static Employee getEmployee(EmplyeeAbstractFactory factory){
        return factory.createEmployee();
    }
}
