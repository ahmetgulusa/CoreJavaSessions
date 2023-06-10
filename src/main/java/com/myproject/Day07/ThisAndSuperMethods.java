package com.myproject.Day07;

public class ThisAndSuperMethods {
    public ThisAndSuperMethods(){
        System.out.println("This is my super class constructor");
    }
    int a = 5;
    int b = 20;

}


class Test extends ThisAndSuperMethods {
    public Test(){
        super();
        System.out.println("This is my child class constructor");
    }
    int a = 10;
    int c = 30;

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
        t.myMethod();
    }

    public void myMethod() {
        System.out.println(super.a);
        System.out.println(super.b);
    }

}