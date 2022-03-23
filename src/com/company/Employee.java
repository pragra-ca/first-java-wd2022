package com.company;

public class Employee {
    private int empId;
    private String empName;
    private double hourlyRate;

    public Employee(int empId, String empName, double hourlyRate) {
        this.empId = empId;
        this.empName = empName;
        this.hourlyRate = hourlyRate;
    }


    public double calculateSalary(){
        return 160*hourlyRate;
    }

    public void printDetails() {
        System.out.println("Name -> "+ empName +", EmpId-->"+empId);
    }
}
