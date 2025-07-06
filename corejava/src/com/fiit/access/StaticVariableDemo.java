package com.fiit.access;

class NonStatic{
    int a = 5;  // primitive instance variable
    int b = 8;
    void display(){
        ++a;
        b=b+5;
        System.out.println("Non static: a="+a+" b="+b);
    }
}
class Static{
    static int a = 5;
    static int b = 8;
    void display(){
        ++a;
        b=b+5;
        System.out.println("Static: a="+a+" b="+b);
    }
}
public class StaticVariableDemo {
    public static void main(String[] args) {
        NonStatic obj1 = new NonStatic();
        //obj1.display();
        NonStatic obj2 = new NonStatic();
        //obj2.display();
        NonStatic obj3 = new NonStatic();
        //obj3.display();
        Static obj4 = new Static();
        obj4.display();
        Static obj5 = new Static();
        obj5.display();
        Static obj6 = new Static();
        obj6.display();
    }
}
