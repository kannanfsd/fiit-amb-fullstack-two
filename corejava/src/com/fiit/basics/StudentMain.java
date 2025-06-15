package com.fiit.basics;

class Students {
    int regId;
    void displayRegId() {
        System.out.println("The Student Registration ID is " + regId);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Students students = new Students();
        students.regId = 1290;
        students.displayRegId();
    }
}
