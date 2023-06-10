package com.myproject.Day07;

public class MethodOverriding {
    int number=30;
    double d=60.555;
    public void calculate() {
        System.out.println("This is calucaltion");
    }

    public void areas() {
        int a = 5;
        int b = 10;
        System.out.println("Area of the rectancglar is :" + (b * a));
    }

}


class Calculator extends MethodOverriding {
    double d=30.555;
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.calculate();
        c.areas();

    }

    @Override
    public void calculate() {
        super.areas(); // super keyoword for parent class.
        System.out.println(this.d); // this keyword for same class
        System.out.println(super.d); // super keyword to print parent class variable
        System.out.println(super.number);

        System.out.println("This is my calculation");
    }

    @Override
    public void areas() {
        int a = 5;
        int b = 5;
        System.out.println("Area of the square is :" + (b * a));
    }

}