package com.myproject.Day06;
/**
 * 1- Constructor should have the same name as Java Class ( Case Sensitive)
 * 2- Constructors don't have any return type (like: int , double, String ..etc)
 * 3- When you don't implicitly define the constructor, Java will create it in run time.
 * 4- When we use parametrized constructor than java will not create the default constructor.
 * 5- Constructors run one time at the time of creating the objects.
 */
public class Main {
    String language;

    public Main() {
        this.language = "Java";
    }

    public Main(String language) { //Python
        this.language = language;
    }

    public void getLanguage() {
        System.out.println("the chosen language is " + language);
    }

    public static void main(String[] args) {

        Main m1 = new Main();
        Main m2 = new Main("Pyhton");
        m1.getLanguage();
        m2.getLanguage();
    }
}
