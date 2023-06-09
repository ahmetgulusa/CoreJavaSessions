package com.myproject.Day03;

public class LoopsInJava {
    public static void main(String[] args) {
        // for(initialize; condition; iteration){
        //code block
        //  }

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        // 0 to 50 even number
        for (int i = 0; i <= 50; i += 2) {
            System.out.println(i);
        }
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        /* Write a loop to print the below in 24 hours
        Morning, Afternoon, Evening, Night
        0-12 morning
        12-15 - afternoon
        15-20 - evening
        20-23 night
         */
        for (int time = 0; time < 24; time++) {
            if (time >= 0 && time < 12) {
                System.out.println(time + " Morning");
            } else if (time >= 12 && time < 15) {
                System.out.println(time + " Afternoon");
            } else if (time >= 15 && time < 20) {
                System.out.println(time + " Evening");
            } else {
                System.out.println(time + " Night");
            }
        }

        // Write a java program to find the sum of natural numbers from 1 to 100
        /*
        1+2+3+4+5+
        sum = sum+i
         */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        // 1 to 100 sum of even numbers
        // 2+4_6+8+10+12
        sum = 0;
        for (int i = 0; i <= 100; i += 2) {
            sum = sum + i;
        }
        System.out.println("EVEN TOTALS");
        System.out.println(sum);


        // 1 to 100 sum of odd numbers
        // 1+3+5+7+9+11
        sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum = sum + i;
        }
        System.out.println(sum);

        /*
        Print the multioplication table of 1
        1 * 1 = 1
        1 * 2 = 2
        1 * 3 = 3

        1 * 10 = 10
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }

        /* Print the below
         *
         * *
         * * *
         * * * *
         * * * * *

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
