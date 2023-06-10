package com.myproject.Day07.accessmodifiers;
/**
 default : if there is no access modifier call default.
 public: access from anywhere
 private: access within the class
 protected: access with in the package
 */
public class AccessModifiersInJava {
    int a = 5;
    public int b= 5;
    private int c=5;
    protected int d=5;


    public static void main(String[] args) {

       AccessModifiersInJava ac= new AccessModifiersInJava();


    }
}

class Test{
    public static void main(String[] args) {
        AccessModifiersInJava ac= new AccessModifiersInJava();
        ac.a=10;
    }
}