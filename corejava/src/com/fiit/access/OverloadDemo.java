package com.fiit.access;

class Overload {
    void test() {
        System.out.println("test - default method.");
    }
    void test(int a, int b){
        System.out.println("test - with int parameters. a="+a+" b="+b);
    }
    void test(String a, String b){
        System.out.println("test - with string parameters. a="+a+" b="+b);
    }
    int test(int a, int b, int c){
        return a+b+c;
    }
}
public class OverloadDemo {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.test();
        overload.test(10,20);
        overload.test("FIIT", "Ambattur");
        System.out.println("Sum of 3 numbers are "+overload.test(10,20,30));
    }
}
