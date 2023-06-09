package com.myproject.Day05;

public class Cycle {
    int gear=5;
    static int tyre=30;
    public static void main(String[] args) {
       Cycle mountainBike= new Cycle();
        System.out.println(mountainBike.gear);
        mountainBike.myTestMethod();

    }

    public void myTestMethod(){
        System.out.println("Hello World");
    }
}
