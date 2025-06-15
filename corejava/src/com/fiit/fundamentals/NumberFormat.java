package com.fiit.fundamentals;

public class NumberFormat {
    public static void main(String[] args) {
        int a = 12;
        int b = 014;
        int c = 0xC;
        int d = 0XC;
        int e = 0b1100;
        int f = 0B1100;
        float g = 4.5f;
        double h = 3.14d;
        System.out.println("Decimal: "+a);
        System.out.println("Octal to Decimal: "+b);
        System.out.println("Hexadecimal to Decimal: "+c +"--> "+d);
        System.out.println("Binary to Decimal: "+e+"--> "+f);
        System.out.println("Float: "+g+" Double: "+h);
    }
}
