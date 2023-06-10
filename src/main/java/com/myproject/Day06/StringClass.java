package com.myproject.Day06;

public class StringClass {
    public static void main(String[] args) {
        String a = new String();
        String b= "Hello";
        String c= "Hello";
        String d = new String("HellO");
        String e="";
        String f= "Today is  /have a great day";
        System.out.println(b==c);
        System.out.println(b==d);
        System.out.println(b.equals(d));
        System.out.println(b.equalsIgnoreCase(d));
        System.out.println(e.isEmpty());
        System.out.println(d.charAt(0));
        System.out.println(d.indexOf('O'));
        System.out.println(d.concat(c));
        System.out.println(d.replace("O","o"));
        System.out.println(f.startsWith("Today"));
        int start=f.indexOf("/");
        System.out.println(f.substring(start+1));
        int dayIndex= f.indexOf(" day");
        System.out.println(f.substring((start + 1), dayIndex)); // starting index is included but not ending one.
        String name = " mehmet Gul    ";
        System.out.println("name = " + name);
        System.out.println("name.trim() = " + name.trim());
        String name1 = "mehmet Gul";
        System.out.println(name1.equals(name.trim()));
        System.out.println("name1.length() = " + name1.length());

        /**
         * String is immutable
         */
        for (int i = 0; i <10000 ; i++) {
            String letter =""+i;
            int x=i;
        }
    }
}
