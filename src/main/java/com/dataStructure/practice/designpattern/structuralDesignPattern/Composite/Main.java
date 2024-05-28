package com.dataStructure.practice.designpattern.structuralDesignPattern.Composite;

public class Main {
    public static void main(String[] args) {
        Department financial=new FinancialDep(1,"Financial Department");
        Department hrDep = new HRDep(2,"HR Department");

        HeadDepartment headDepartment= new HeadDepartment(3,"Head Department");
        headDepartment.addDepartment(financial);
        headDepartment.addDepartment(hrDep);

        headDepartment.printDepartment();
        financial.printDepartment();
    }
}
