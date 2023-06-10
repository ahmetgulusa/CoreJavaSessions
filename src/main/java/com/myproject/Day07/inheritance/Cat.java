package com.myproject.Day07.inheritance;

public class Cat extends Animal{
    public static void mySubClassMethod(){
        System.out.println("This method from cat class");
    }
    public static void main(String[] args) {
        mySubClassMethod();
        bark();
        run();
        eat();
        sleep();
    }

}
