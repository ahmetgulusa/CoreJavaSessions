package com.myproject.Day02;

public class ArithmeticOperators {
    /**
     * + : addtion
     * - : substraction
     * * : multiplication
     * / : division
     * % : reminder 
     */
    
  

    public static void main(String[] args) {
        int num1= 12;
        int num2=6;
        int number3=0;
        number3 = num1 + num2;
        System.out.println("number3 = " + number3); // 18
        number3 = num1 - num2;
        System.out.println("number3 = " + number3); //6
        number3 = num1 * num2;
        System.out.println("number3 = " + number3); // 72
        number3 = num1 / num2;
        System.out.println("number3 = " + number3); //2
        number3 = num1 % num2;
        System.out.println("number3 = " + number3); //0

    }
}
