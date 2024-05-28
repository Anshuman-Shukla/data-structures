package com.dataStructure.practice.designpattern.structuralDesignPattern.Composite;

public class HRDep implements Department{
    private int id;
    private String dep;

    public HRDep(int id, String dep) {
        this.id = id;
        this.dep = dep;
    }

    @Override
    public void printDepartment() {
        System.out.println(getClass().getSimpleName());
    }
}
