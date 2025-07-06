package com.fiit.access;
class MethodAccess{
    static int a = 5;          // non-static primitive instance
    static int b =8;    // static primitive instance
    void method1(){     // non-static user-defined concrete method
        ++a;
        b=b+5;
        System.out.println("Non static: a="+a+" b="+b);
        System.out.println("This is non-static method in MethodAccess class");
    }
    static void method2(){
        ++a;
        b=b+5;
        System.out.println("Non static: a="+a+" b="+b);
        System.out.println("This is static method in MethodAccess class");
    }
}
public class StaticMethodDemo {
    void display1(){
        System.out.println("This is a non-static method within a class");
    }
    static void display2(){
        System.out.println("This is a static method within a class");
    }
    public static void main(String[] args) {
        StaticMethodDemo obj = new StaticMethodDemo();
        obj.display1();
        display2();
        MethodAccess obj2 = new MethodAccess();
        obj2.method1();
        MethodAccess.method2();
    }
}
