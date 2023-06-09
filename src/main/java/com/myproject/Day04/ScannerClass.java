package com.myproject.Day04;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        //Create Scanner class object to accept inputs from keyboard
        Scanner getInputFromKeyboard = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner sc =new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = getInputFromKeyboard.nextLine(); // multiple words like => "Today whether is good"

        System.out.println("Your name is " + name);

        System.out.println("Please enter a byte value");
        byte value = getInputFromKeyboard.nextByte();
        System.out.println("The byte value is " + value);

        System.out.println("Enter short value");
        short valueShort = getInputFromKeyboard.nextShort();
        System.out.println("The short value is " + valueShort);

        System.out.println("Enter integer value");
        int valueInteger = getInputFromKeyboard.nextInt();
        System.out.println("The integer value is " + valueInteger);

        System.out.println("Please enter long value");
        long valueLong = getInputFromKeyboard.nextLong();
        System.out.println("The long value is " + valueLong);

        System.out.println("Please enter double value");
        double valueDouble = getInputFromKeyboard.nextDouble();
        System.out.println("The double value is " + valueDouble);

        System.out.println("Please enter float value");
        float valueFloat = getInputFromKeyboard.nextFloat();
        System.out.println("The float value is " + valueFloat);

        System.out.println("Please enter single string word value");
        String valueString = getInputFromKeyboard.next();
        System.out.println("The single string word is " + valueString);

        System.out.println("Please enter boolean value");
        boolean valueBoolean = getInputFromKeyboard.nextBoolean();
        System.out.println("The boolean value is " + valueBoolean);

        getInputFromKeyboard.close();

    }
}
