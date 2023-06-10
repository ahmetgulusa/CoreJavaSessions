package com.myproject.Day07;

public class KeywordsInJava {
    //final keyword is constant
    final static double pi = 3.1456677777;

    public static void main(String[] args) {
        // pi=40;  // you cannot replace the final value
    }

    //This is method overloading/
    //We have another way of method overriding that is in inheritance
    public final void test() {
        System.out.println("Hello");
    }

    public void test(String a) {
        System.out.println("Hello " + a);
    }
}
