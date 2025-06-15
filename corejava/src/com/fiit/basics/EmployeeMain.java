package com.fiit.basics;

class Employee{
    long empId = 1201;
    String empName;
    void display() {    //user-defined method
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.empName = "Ramachandran";
        employee.display();
    }
}
