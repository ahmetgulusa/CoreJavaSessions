package com.myproject.Day07;

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("sb = " + sb);
        sb.append(", World");
        System.out.println("sb = " + sb);
        sb.insert(3, "Hey"); // 3 is not the index, it is the position. 
        System.out.println("sb = " + sb);

        sb.replace(3,6,"Hi");// starting index is included but not ending index
        System.out.println("sb = " + sb);

        sb.delete(3,5);
        System.out.println("sb = " + sb);

        // Today is a good day
        sb.reverse();
        System.out.println("sb = " + sb);
        
    }
}
