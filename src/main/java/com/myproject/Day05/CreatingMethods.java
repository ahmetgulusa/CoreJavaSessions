package com.myproject.Day05;

import java.util.Scanner;

public class CreatingMethods {
    int a=5;
    static int b=10;
    public static void main(String[] args) {
        System.out.println("Hello World");
        myMethod();

        int f=10;

        CreatingMethods myObject= new CreatingMethods();
        myObject.testMethod();
       int value= myObject.testMethod1();
        System.out.println(f * value);

        String names = myObject.testMethod2();
        System.out.println(names);
    }
    public static void myMethod(){
        int d=5, e=8;
        System.out.println("This is my method");
        System.out.println(d+e);
    }

    public void testMethod() {

    }

    public int testMethod1() {
        int d=5,e=10;
        int c= d+e;
        return c;
    }

    public String testMethod2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        return name;
    }



}
