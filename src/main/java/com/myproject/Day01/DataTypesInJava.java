package com.myproject.Day01;

public class DataTypesInJava {
    /**
     * Default values in Data Types are only in
     * Class level or
     * Instance level or
     * Global level
     */
    static boolean test;
    static byte abc;

    public static void main(String[] args) {
        /**
         * boolean : it is only true or false
         * by default : it is false
         * syntax: boolean userDefinedName= true
         */
        boolean myValue=true;
        System.out.println("myValue = " + myValue);
        boolean myAnotherValue=false;
        System.out.println("myAnotherValue = " + myAnotherValue);
        boolean result=false;
        System.out.println("Initial defined result = " + result);
        result=true;
        System.out.println("After changing the result = " + result);

        System.out.println("test = " + test);

        /**
         * byte: range is -128 to +127
         * size: 8 bit = 1 byte
         */
        System.out.println("abc = " + abc);
        byte value1=0;
        //This will not work if you don't initialize. you need to initialize any value.
        System.out.println("value1 = " + value1);

        /**
         * char: 2byte = 16bit
         * char is character
         */
        char charValue= 'a';
        System.out.println("charValue = " + charValue);

        /**
         * short: 2byte =16bits
         * -32768 to +32767
         */
        short myShortValue3= 234;
        System.out.println("myShortValue3 = " + myShortValue3);

        /**
         * int = 4byte = 32 bits
         * -2,147 483 648 to -2,147 483 647
         */
        int myIntegerValue= 4554433;
        System.out.println("myIntegerValue = " + myIntegerValue);
        int myPhoneNumber= 2_144_563_333;
        System.out.println("myPhoneNumber = " + myPhoneNumber);
       // int myAnotherPhoneNumber= 770_560_7708; // out of range
      //  System.out.println("myAnotherPhoneNumber = " + myAnotherPhoneNumber);

        /**
         * long
         */

        //These data types are for decimal points
        /**
         * float
         * when you define float number with decimal points
         * you need to attach F or f at the end
         * 3.555F or 3.444f
         */

        float aa= 5.44f;
        float bb = 3.33F;
        float cc= aa/bb;
        System.out.println("cc = " + cc);

        float aaa= 5f; // F or f
        float bbb = 3f; //F or f
        float ccc= aaa/bbb;
        System.out.println("ccc = " + ccc);

        /**
         * double
         */
        double a= 5.33;
        double b = 3.44;
        double c= a/b;
        System.out.println("c = " + c);


    }
}
