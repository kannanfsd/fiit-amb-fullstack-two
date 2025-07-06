package com.fiit.access;
class Student{
    int rollNo;
    String studentName;
    String location;
    long contactNo;
    public Student() {
        System.out.println("Student: Default constructor.");
    }
    public Student(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Single Argument constructor");
    }
    public Student(int rollNo, String studentName) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        System.out.println("Two Argument constructor");
    }
    public Student(int rollNo, String studentName, String location) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.location = location;
        System.out.println("Three Argument constructor");
    }
    public Student(int rollNo, String studentName, String location, long contactNo) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.location = location;
        this.contactNo = contactNo;
        System.out.println("Four Argument constructor");
    }
}
public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student(1011);
        Student student3 = new Student(1012, "Priya");
        Student student4 = new Student(1013, "Vishnu", "Chennai");
        Student student5 = new Student(1014, "Kumar", "Ambattur", 9812012345L);
    }
}
