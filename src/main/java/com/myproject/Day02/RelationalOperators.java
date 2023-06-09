package com.myproject.Day02;

public class RelationalOperators {
    /**
               > : Greater than
               >=: Greater than or equal to
               < : Less than
               <= : Less than or equal to
               == : equal to
               != : not equal to

               && : AND
               || : OR

        */

      /*
		    && : And  logic        true && true ==> true,   other wise ==> false
		    || : or  logic
		          				true  || false  ==> true
		          				true  || true   ==> true
		          				false || false  ==> false

		          				true || false || true || true || false => true
			if both conditions are false it will return false, otherwise will return true
		 */
    public static void main(String[] args) {
        System.out.println(9 > 10); // false
        System.out.println(10 >= 10); //true
        System.out.println(9 < 10); //true
        System.out.println(25 <= 0); //false
        System.out.println(5 == 5); //true
        System.out.println(10 != 8); //true
        System.out.println(2 != 2);//false


        boolean w = 10 > 9 || 9 > 10 || 5 == 3;// true
        boolean c = !false != !true; // true != false => true
        boolean t = 10 > 9 && 9 > 10 && 5 == 5; //false

    }
}
