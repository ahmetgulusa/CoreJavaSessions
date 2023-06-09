package com.myproject.Day04;

public class ContinueAndBreak {
    public static void main(String[] args) {
        System.out.println("CONTINUE STATEMENT");
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                if(j==2) {
                    continue;
                }
                System.out.println("This is second loop "+j);
            }
            System.out.println("----------------------");
        }

        System.out.println("BREAK STATEMENT");
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                if(j==2) {
                    break;
                }
                System.out.println("This is second loop "+j);
            }
            System.out.println("----------------------");
        }
    }
}
