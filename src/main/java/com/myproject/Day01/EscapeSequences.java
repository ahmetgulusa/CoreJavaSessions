package com.myproject.Day01;

public class EscapeSequences {
    public static void main(String[] args) {
        /**
         * Java has reserved keyword and symbols
         *  class, public, private, break, continue type of keywords are reserved keywords.
         *  Such as Java has symbols which are also reserved .
         *   ' single quote. " double quote \ back slash ..etc
         */
        //  Hi my name is "Mehmet"
        System.out.println("Hi my name is \"Mehmet\"");
        // \' single quote
        System.out.println("This is \'my single quote\' used here.");

        // \" double quote
        System.out.println("This the \"double quote\" used here");

        // this is the value \change me\ and apply
        System.out.println("This is the value \\change me\\ and apply");

        // \n -> this is prodiving new line to your string.
        /*
         Hi,
         how are you doing?
         Today weather is perfect
         */
        System.out.println("Hi, \nhow are you doing? \nToday weather is perfect");
        /*
{
  "instructions": [
    "Enter your JSON in the editor.",
    "Select an item to view its path.",
    "Replace 'x' with the name of your variable."
  ]
}
         */
        System.out.println("{\n" +
                "  \"instructions\": [\n" +
                "    \"Enter your JSON in the editor.\",\n" +
                "    \"Select an item to view its path.\",\n" +
                "    \"Replace 'x' with the name of your variable.\"\n" +
                "  ]\n" +
                "}");

        System.out.println("Hi, \t\t\thow are you doing? \tToday weather is perfect");

        System.out.println("Name\t\tLast Name\t\tAddress");
        System.out.println("Mehmet\t\t\tGul\t\t\t\t5106 Roswell");




    }

}
