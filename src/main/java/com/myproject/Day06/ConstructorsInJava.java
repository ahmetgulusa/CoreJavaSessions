package com.myproject.Day06;

public class ConstructorsInJava {
    /**
     * Defaulkt Constructor which is created by java by default and we don't see it
     */
    /**
     * This will trigger when we create the instance object of a Class
     * This is called No argument contructor
     */
    public ConstructorsInJava() {
        System.out.println("This is no argument constructor");
    }

    int a, b;
    String firstNAme, lastName;

    public ConstructorsInJava(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ConstructorsInJava(int a, int b, int c) {
        this.a = a;
        this.b = b;
    }

    public ConstructorsInJava(String firstNAme, String lastName) {
        this.firstNAme = firstNAme;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        ConstructorsInJava myObjName = new ConstructorsInJava(5, 10);
        ConstructorsInJava myObj = new ConstructorsInJava();
        System.out.println(myObjName.a);
        System.out.println(myObjName.b);
    }


}
