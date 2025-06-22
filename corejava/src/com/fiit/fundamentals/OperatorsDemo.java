package com.fiit.fundamentals;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a++);    // 10 unary operators
        System.out.println(b--);    // 20
        System.out.println(++a);    // 12
        System.out.println(--b);    // 18

        System.out.println((a+b));  // 30 Binary operators
        System.out.println((a-b));  // -6
        System.out.println((a*b));  // 216

        int findBig = (a>b)?a:b;    // ?:   ternary operators
        System.out.println(findBig);
    }
}
