package com.myproject.Day05;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers= {3,5,6,7,89,44,332,23,67};
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

        //Enhanced loop => For each loop
        //syntax
        /* one way direction.;
        for ( Data_Type value : Array){
            //statement
        }
         */
        for (int myValue :numbers){
            System.out.println(myValue);
        }

        //2D array
        int[][] myNumbers={
                {3,4},
                {5,6},
                {7,8},
                {8,9},
                {9,10}};

        System.out.println(myNumbers[2][1]);

        String[][] names= {
                {"A","B","C"},
                {"D","E","F"},
                {"G","H","I"},
                {"J","2","5"}};
        System.out.println(names[3][1]);
        String[][][] names3DArray={
                {
                        {"A","B","C"},
                        {"D","E","F"},
                        {"G","H","I"},
                        {"J","2","5"}
                },
                {
                        {"A","B","C"},
                        {"D","E","F"},
                        {"G","H","I"},
                        {"J","2","5"}
                },
                {
                        {"A","B","C"},
                        {"D","E","F"},
                        {"G","H","I"},
                        {"J","2","5"}
                }
        };

        System.out.println(names3DArray[1][2][2]);

        String test= "madam";
        //solution 1: string -> array , array -> reverse, first array == second array
        // [m,a,d,a,m] => reverse [m,a,d,a,m]
        // solution2 : madam
        for (int i = 0; i < test.length()/2; i++) {
            if(test.charAt(i)==test.charAt(test.length()-(i+1))){
                System.out.println("Palindrom");
            }
        }

        Cycle cycle = new Cycle();
        cycle.myTestMethod();
        cycle.gear=10;
        Cycle.tyre=20;
        System.out.println(cycle.gear);

        Cycle another= new Cycle();
        another.gear=200;
        System.out.println(another.gear);

        Cycle two= new Cycle();
        System.out.println(two.gear);
        System.out.println(Cycle.tyre);

    }
}

















