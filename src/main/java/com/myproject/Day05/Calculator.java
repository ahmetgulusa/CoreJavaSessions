package com.myproject.Day05;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int first= scanner.nextInt();
        System.out.println("Enter second number");
        int second= scanner.nextInt();

        int add=calculator.addition(first,second);
        System.out.println("addition = " + add);
        double result = calculator.addition(2.5, 2.5);
        System.out.println("result = " + result);

        int subs=calculator.subs(first,second);
        System.out.println("subs = " + subs);

        int multip = calculator.multiplication(first,second);
        System.out.println("multip = " + multip);

        int div = calculator.division(first,second);
        System.out.println("div = " + div);

        //Method Overloading
        
    }

    /*
    addition
    multiplication
    subs
    division
     */
    //3, 5  => 5, 2.5 => 2.5 ,2.5  , 2.5 , 4 
    public int addition(int a, int b) {return  a + b;}
    public double addition(int a, double b) {return  a + b;}
    public double addition(double a, double b) {return  a + b;}
    public double addition(double a, int b) {return  a + b;}
    

    public int subs(int a, int b) {
        int c = a - b;
        return c;
    }

    public int multiplication(int a, int b) {
        int c = a * b;
        return c;
    }

    public int division(int a, int b) {
        int c = a / b;
        return c;
    }
}
