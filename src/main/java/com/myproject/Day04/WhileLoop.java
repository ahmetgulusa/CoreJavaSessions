package com.myproject.Day04;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        while (condition) { // condtion => true or false
            //statment
        }
         */
      /*  int i=0;
        for (;i<50;){
            System.out.println();
            i++;
        }*/
        int i = 0;
        while (i < 50) {
            System.out.println("Hi");
            i++;
        }

        //stop the loop when count reach to 20
        int count = 0;
        while (true) {
            System.out.println("Count number " + count);
            if (count == 20)
                break;
            count++;
        }

        //sum of numbers from 1 to 10
        // 1+2+3+4+5+6+7+8+9+10
        int a = 1;
        int sum = 0;
        while (a <= 10) {
            sum = sum + a;
            a++;
        }
        System.out.println(sum);

        // Find the factorial for the given number
        // 5! => 5 x 4 x 3 x 2 x 1 =120
        int number = 10;
        int factorial = 1;
        while (number >= 1) {
            factorial = factorial * number;
            number--;
        }
        System.out.println(factorial);

        factorial = 1;
        for (int j = 1; j <= 10; j++) {
            factorial = factorial * j;
        }
        System.out.println("------------------");
        System.out.println(factorial);

        //write even numbers up to 100
        int num=1;

        while (true){
            if(num%2==0)
                System.out.print(num+"\t");
            if(num==100)
                break;
            num++;
        }

        /*
        print each number for the given value 567
        print 5
        print 6
        print 7
        567%10 =7
        56%10 =6
        5 % 10 =5
         */
        int value=567;
        System.out.println();
        while (value>0){
            int x=value%10;//7 6 5
            System.out.println("x = " + x);
            value= value/10;//56 5
        }

    }
}
