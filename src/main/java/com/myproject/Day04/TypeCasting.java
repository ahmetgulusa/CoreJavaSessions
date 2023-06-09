package com.myproject.Day04;

public class TypeCasting {
    public static void main(String[] args) {
        /**
         * Casting: Converting larger primitive data types to smaller sizes
         * casting: explicit or implicit
         * primitives: byte, short, int, long, float, double
         */
        //implicit casting:
        int a = 10;
        double d;
        d = a;
        System.out.println(d);

        //bigger data types implicitly accepts smaller data types.
        byte number = 111;
        int number2 = 10;
        number2 = number;
        double number3 = number;
        number3 = number2;

        //Explicit casting:
        double f = 30.89;
        byte b = (byte) f;
        short c = (short) f;
        int dd = (int) f;
        float ff= (float) f;
        System.out.println(b);

        int aaa= 10;
        System.out.println("Integer value "+aaa); //10

        double bbbb= aaa;
        System.out.println("This is auto widening "+bbbb); // 10.0

        double cc=10.99;
        System.out.println("This is double value "+cc); //10.99

        int ddd = (int) cc;
        System.out.println("Narrowing down the double value "+ddd); // 10
    }
}
