package com.dataStructure.practice.designpattern.structuralDesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{
    private int id;
    private String dep;
    private List<Department> departments;

    public HeadDepartment(int id, String dep) {
        this.id = id;
        this.dep = dep;
        this.departments = new ArrayList<>();
    }

    @Override
    public void printDepartment() {
        departments.forEach(Department::printDepartment);
    }
    public void addDepartment(Department dep){
        departments.add(dep);
    }
    public void removeDepartment(Department dep){
        departments.remove(dep);
    }
}
