package com.dataStructure.practice.designpattern.structuralDesignPattern.Composite;

public class FinancialDep implements Department{

    private int id;
    private String dep;

    public FinancialDep(int id, String dep) {
        this.id = id;
        this.dep = dep;
    }

    @Override
    public void printDepartment() {
        System.out.println(getClass().getSimpleName());
    }
}
