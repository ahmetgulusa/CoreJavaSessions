package com.myproject.Day04;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean test= false;
        while (test){
            System.out.println("While loop");
        }
        int n=5;
        /*
        get me the paasword = sdsadasdsad
        while(){
         get me the password= fsdfsdfsd
         fsdfsdfsdfsdfsdf
         }
         do{
            get me the password =fsdfsdfsd
            dfdsfsdfs fsdf sdf sd
            }while (True);
         */
        do{
            System.out.println("Do while loop");
            n++;
            System.out.println(n);
        }while (n<5);



        String password = "secret";
        String userInput;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the password: ");
            userInput = scanner.nextLine();
        } while (!userInput.equals(password));

        System.out.println("Access granted!");


        int secretNumber = 42;
        int guess;

        do {
            System.out.print("Guess the number (between 1 and 100): ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != secretNumber);

        System.out.println("Congratulations! You guessed the correct number.");

/*
        secretNumber = 32;
        System.out.print("Guess the number (between 1 and 50): ");
        guess = scanner.nextInt();

        while (guess != secretNumber){
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Congratulations! You guessed the correct number.");*/
    }
}
