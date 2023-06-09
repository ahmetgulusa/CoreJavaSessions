package com.myproject.Day02;

public class TernaryOperator {
    public static void main(String[] args) {
        int a=5,b=4 ,c=7;
       if(a==5){
           System.out.println(b);
       }else{
           System.out.println(c);
       }

       int result= (a>5) ? b : c;
        System.out.println("result = " + result);
    }
}
