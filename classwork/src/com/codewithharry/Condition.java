package com.codewithharry;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    // a code to generate substring
        System.out.println("Enter your first string");
         String sam = scanner.nextLine();

        System.out.println("Enter your second string");
        String samt = scanner.nextLine();

        if (sam.contains(samt)){
            System.out.println("The word is a substring of the first");
        }
        else {
            System.out.println("This is not a substring");
        }
    }


}
