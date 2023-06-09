package com.myproject.Day03;

public class FlowControls {
    public static void main(String[] args) {
       /*
               > : Greater than
               >=: Greater than or equal to
               < : Less than
               <= : Less than or equal to
               == : equal to
               != : not equal to

               && : AND
               || : OR
               ! : NOT
        Syntax:
        if(condition){
           //statement
        }
        */
        /*
        0-70 => F
        70-80 => C
        80-90 => B
        90-100 => A
         */
        // 90 <= A<= 100
        // IF CONDITIONS
        int math = 80;
        if (math >= 90 && math <= 100) {
            System.out.println("You have A");
        }

        if (math >= 80 && math < 90) {
            System.out.println("You have B");
        }
        if (math > 69 && math < 80) {
            System.out.println("You have a C");
        }
        if (!(math < 70)) {
            System.out.println("You have F");
        }

        if (!true) {
            System.out.println("Hi");
        }

        // IF - ELSE CONDITIONS
        /**
         if(condition){
         //process my code
         }else{
         //process my another code
         }

         if the condition is false then
         it will run the else block
         */
        math = 51;
        if (math >= 50) {
            System.out.println("This is if block");
        } else {
            System.out.println("This is else block");
        }

        //if the 4 remainder of a number is 0 or 2, This number is even
        int num = 20;
        if (num % 4 == 0 || num % 4 == 2) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }

        // IF - ELSE IF
        /**
         if(condition){
         //statement
         }else if(condition){
         //statement
         }else {
         //stament
         }
         */

          /*
                90 <= grade <= 100      ==> A
		 		80 <= grade < 90        ==> B
		 		70 <= grade < 80        ==> C
		 		60 <= grade < 70        ==> D
		 			else                ==> F
         */
        int grade = 80;
        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("C");
        } else if (grade < 70) {
            System.out.println("F");
        } else {
            System.out.println("Enter the grade between 0 to 100");
        }

        //NESTED IF
        if (grade >= 90 && grade <= 100) {
            if (grade >= 96) {
                System.out.println("A+");
            }
            System.out.println("A");
        }

        int age = 60;
        if (age >= 18) {
            if (age >= 50) {
                System.out.println("you are not eligible to work");
                if (age >= 60) {
                    System.out.println("You are eligible for retirement");
                }
               // return;
            }
            System.out.println("You are eligible to work");
        } else {
            System.out.println("you cannot work");
        }

        String car="Mercedes";
        int myAge=18;
        if(car=="Mercedes"){
            if(myAge>=18){
                System.out.println("You are eligible to drive my car");
            }else
                System.out.println("Sorry, you cannot drive my car");
        }else{
            System.out.println("Your car is not matching");
        }


        //Switch- Case
        /**
         * switch - case statement supports
         * byte, short, char, and int
         * from primitive data types.
         *
         * Non-primitive: String
         */
        /*
        switch (something){
            case value :
                //statement
            case value2 :
                //statement
            defafult:
                //statement
        }
        */
          /* int math=67;
        if (math == 60) {
            System.out.println("C");
        } else if (math == 70) {
            System.out.println("B");
        } else if (math == 80) {
            System.out.println("A");
        } else {
            System.out.println("Please enter valid mark");
        }*/
        int maths = 60;
        switch (maths){
            case 60:
                System.out.println("C");
            case 70:
                System.out.println("B");
            case 80:
                System.out.println("A");
            default:
                System.out.println("Please enter valid mark");
        }

        /*
        Please enter your choice from below options
        1- Change of Address
        2- Change of Registration
        3- Update Address
        4- Cancel subscription
         */

        System.out.println("Please enter your choice from below options\n" +
                "        1- Change of Address \n" +
                "        2- Change of Registration\n" +
                "        3- Update Address\n" +
                "        4- Cancel subscription");

        int option=5;
        switch (option){
            case 1:
                System.out.println("You selected change of address");
                break;
            case 2:
                System.out.println("You selected change of registration");
                break;
            case 3:
                System.out.println("You selected update address");
                break;
            case 4:
                System.out.println("You chose to cancel subscruption");
                break;
            default:
                System.out.println("Please enter valid number 1 trough 4");
        }
    }


}
