package com.myproject.Day05;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        /*
         String[] myArray;
         String myArray[];
         int[] a;
         int b[];

         myArray[]
         */

        int age =10;
         //         0 1 2 3 4   5  6
        int[] ages={5,7,8,9,044,55,666};
        String names[] ={"Mehmet","Ahmet","Mahmut"};

        System.out.println(ages[6]);
        for (int i=0;i<ages.length;i++){
            System.out.println(ages[i]);
        }

        int data[] = new int[10];
        data[0]=3;
        data[1]=5;
        data[3]=6;
        System.out.println(Arrays.toString(data));

        for (int i = 0; i <data.length ; i++) {
            data[i]=i+1;
            System.out.println(data[i]);
        }
        System.out.println(Arrays.toString(data));


    }
}
