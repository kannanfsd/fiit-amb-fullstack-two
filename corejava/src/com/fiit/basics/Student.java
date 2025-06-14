package com.fiit.basics;

public class Student {
    int regNo;
    String name;
    void displayDetails() {
        System.out.println("Student Reg No: " + regNo);
        System.out.println("Welcome Mr./Ms. " + name);
    }
    public static void main(String[] args) {
        Student s = null;
        s = new Student();  // calling default constructor method
        s.regNo = 1255;
        s.name = "John Doe";
        s.displayDetails();
    }
}
