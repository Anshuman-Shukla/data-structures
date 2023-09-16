package com.dataStructure.practice.designpattern.abstractFactory;

public class EmployeeFactory {
    public static Employee getEmployee(EmplyeeAbstractFactory factory){
        return factory.createEmployee();
    }
}
