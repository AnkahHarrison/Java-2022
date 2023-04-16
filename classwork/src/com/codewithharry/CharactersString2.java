package com.codewithharry;

public class CharactersString2 {
    public static void main(String[] args) {
        //Escape sequences in java \t \n \" \' \b
        System.out.println("Testing how the tab \t looks like");
        System.out.println("Testing how the single quote \' looks like\'");
        System.out.println("Testing how the newline \n looks like");
        System.out.println("Testing how the double quotes \" looks like\"");

        //Casting Characters as numbers and vice versa
        //finding characters in numbers

        System.out.println("526 represents char :"+(char)526);
        System.out.println("43 represents char :"+(char)43);
        System.out.println("4554 represents char :"+(char)4554);
        System.out.println("34534 represents char :"+(char)34534);

        //finding numbers in characters
        System.out.println("? represents : "+(int)'?' );
        System.out.println("+ represents : "+(int)'+' );


        //Declaration of characters
        char letter ='b';
        char num = '2';
        System.out.println("Is "+letter +" a number?"+ Character.isDigit(letter));
        System.out.println("Is "+letter +" a letter?"+ Character.isLetter(letter));
        System.out.println();
        System.out.println("Is "+letter +" a number?"+ Character.isDigit(num));
        System.out.println("Is "+letter +" a letter?"+ Character.isLetter(num));

        System.out.println("Is "+letter+ " an uppercase? " +Character.isUpperCase(letter));

        System.out.println("Converting a variable "+ letter+ " to uppercase "+ Character.toUpperCase(letter));

        //STRING DATATYPE

        String Name ="Samuel Annan";
        String hometown ="Elmina";
        //Lenght of strings

        System.out.println("name "+ " is of length "+ Name.length());
        System.out.println(Name.toUpperCase());
        System.out.println(Name.toLowerCase());
        // System.out.println(Name.trim());

        //How to compare strings
        String Firstname ="Samuel";
        String Surname ="Annan";

        System.out.println(Firstname.equals(Surname));
        System.out.println(Firstname.equalsIgnoreCase(Name));
        System.out.println(Name.contains(Firstname));
        System.out.println(hometown.startsWith("El"));

        System.out.println((char)43);
        System.out.println((int)43
        );

        System.out.println((char)546);
        System.out.println((int)'+' );
        System.out.println((int)'+');



    }
}
