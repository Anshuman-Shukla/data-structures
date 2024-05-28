package com.dataStructure.practice.designpattern.creationalDesignPattern.factory;

public class EmployeeFactory {
    public static Employee getInstanceOfDeveloper(String empType){
        if(empType.trim().equalsIgnoreCase("JAVA")) {
            return new JavaDeveloper();
        }
        else if (empType.trim().equalsIgnoreCase("NET")) {
            return new DotNetDeveloper();
        } else if (empType.trim().equalsIgnoreCase("ANGULAR")) {
            return new AngularDeveloper();
        }
        else{
            return null;
        }
    }
}
