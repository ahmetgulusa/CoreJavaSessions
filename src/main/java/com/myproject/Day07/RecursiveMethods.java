package com.myproject.Day07;

public class RecursiveMethods {
    // calculating the factorial number.
    public int recursive(int n) {
        if (n != 0) {
            return n * recursive(n - 1);
        } else
            return 1;
    }

    public static void main(String[] args) {
        RecursiveMethods rm = new RecursiveMethods();

        int result = rm.recursive(5);
        System.out.println(result);
    }
}
