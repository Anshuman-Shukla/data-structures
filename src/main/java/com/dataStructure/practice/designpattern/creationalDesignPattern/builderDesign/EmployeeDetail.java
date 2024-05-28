package com.dataStructure.practice.designpattern.creationalDesignPattern.builderDesign;

public class EmployeeDetail {
    private final int id;
    private final String empName;
    private final String empEmail;

    private EmployeeDetail(EmployeeBuilder builder) {
        this.id = builder.id;
        this.empName = builder.empName;
        this.empEmail = builder.empEmail;
    }

    public int getId() {
        return id;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    @Override
    public String toString() {
        return "EmployeeDetail{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                '}';
    }

    static class EmployeeBuilder {
        private int id;
        private String empName;
        private String empEmail;

        public EmployeeBuilder() {

        }

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setEmpName(String empName) {
            this.empName = empName;
            return this;
        }

        public EmployeeBuilder setEmpEmail(String empEmail) {
            this.empEmail = empEmail;
            return this;
        }

        public EmployeeDetail build() {
            return new EmployeeDetail(this);
        }
    }
}
