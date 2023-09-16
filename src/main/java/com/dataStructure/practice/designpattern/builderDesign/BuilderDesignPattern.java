package com.dataStructure.practice.designpattern.builderDesign;

public class BuilderDesignPattern {
    public static void main(String[] args) {
        EmployeeDetail detail = new EmployeeDetail.EmployeeBuilder().setId(12432)
                .setEmpName("ANSHUMAN")
                .setEmpEmail("anshuman@gmail.com")
                .build();
        System.out.println(detail.toString());
    }
}
