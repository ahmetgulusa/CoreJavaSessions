package com.myproject.Day07;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Some");

        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.append(" " + 25);
        System.out.println(sb);

        String newValue = sb.toString();
        System.out.println(newValue);

        String newValue1 = String.valueOf(sb);
        System.out.println(newValue1);
        System.out.println("====");
        sb.appendCodePoint(55);
        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder("sdfsdfds fsdf sdf sdf sdfsdfsdfsdf sdfsdfsd fsd fwefwefwefwefwe fwe fwe fwefwefw efwe ");
        System.out.println(sb.capacity());

    }
}
