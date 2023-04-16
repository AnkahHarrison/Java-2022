package com.codewithharry;

import java.util.Scanner;

public class selectionsLoops {
    public static void main(String[] args) {
        //Selection statements in programming allow us to choose which block of code to execute based on a specified condition.
        // The two most common types of selection statements in Java are the if statement and the switch statement.
        //
        //The if statement allows you to execute a block of code if a certain condition is met. For

        //a code to print a number is odd or even using if else statements

        System.out.println("Enter a number to check if it is odd or even");
        Scanner input =new Scanner(System.in);
        int a;
        a=input.nextInt();
        if(a%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");


        }


//        if (a%2==0)
//        {
//            System.out.println("The number is even");
//        }
//        else if(a%2!=0)
//        {
//            System.out.println("The number is odd");
//        }
//        else
//        {
//            System.out.println("The number is neither even nor odd");
//        }
        // a code application that ask the user to enter two integers  obtain them from the user and print their sum product difference and quotient
        // a java program that display all numbers from 30 t0 60 that are divisible by or 4 or 3 but not both

//        int b;
//        System.out.println("Enter the first integer");
//        b=input.nextInt();
//        System.out.println("Enter the second integer");
//        int c;
//        c=input.nextInt();
//        System.out.println("The sum of the two integers is "+(b+c));
//        System.out.println("The product of the two integers is "+(b*c));
//        System.out.println("The difference of the two integers is "+(b-c));
//        System.out.println("The quotient of the two integers is "+(b/c));
    }
}
