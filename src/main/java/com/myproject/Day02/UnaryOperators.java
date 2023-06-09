package com.myproject.Day02;

public class UnaryOperators {
    public static void main(String[] args) {
            /*
                + : positive
                - : negative
                ++ : increment =>  i=i+1
                -- : decrement => i=i-1
         */


        // ++ : increment =>  i=i+1 =>  i++  , ++i
        int i = 5;
        System.out.println(++i); // i? =6
        System.out.println(i); //i=> 6
        int z =5;
        System.out.println(z++); // z? =5
        System.out.println(z); // z=> 6

        boolean value= true;
        System.out.println(!value); // true or false ??
    }
}
