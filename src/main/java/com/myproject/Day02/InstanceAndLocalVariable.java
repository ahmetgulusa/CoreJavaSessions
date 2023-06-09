package com.myproject.Day02;

public class InstanceAndLocalVariable {
    /**
     * The variable define in class level is called
     * Intance variable
     */
    int b = 30; // what type of variable is this?
    static  int t=20;


    public static void main(String[] args) {
        /**
         * The variable define in method level is called
         * local variable.
         * Any variable define inside the block { }
         * is local in its place.
         */
        int a = 20; // what type of variable is this?
        System.out.println(t);

    }

    public void test1() {
        int z = 30;
        System.out.println(b);
    }

    public void test2() {
        int x = 30;
        System.out.println(b);
        {
            int k=5;
            if(true){
                k=15;
            }
            System.out.println(b);
        }
       // System.out.println(k);
        int g=0;
        if(true){
            g= 5;
        }
        System.out.println(g);
    }
}
