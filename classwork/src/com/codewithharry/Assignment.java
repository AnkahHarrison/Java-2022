package com.codewithharry;

import java.util.InputMismatchException;
        import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        double x=0.0;
        double y=0.0;
        double z=0.0;
        boolean conditionwronginput=true;
        boolean condition=true;
        boolean conditionzero=true;


        Scanner input=new Scanner(System.in);
        //floating division by zero
        //System.out.println((2.1/0.0));
        //System.out.println((-2.1/0.0));
        //System.out.println((0.0/0.0));

        System.out.print("Enter a value for x : ");

        while (conditionwronginput) {


            try {
                //System.out.println("Enter a value for x : ");
                x = input.nextDouble(); //likely of an input mismatch
                //user enters an integer
                conditionwronginput = false;
            } catch (Exception e) {
                System.out.println("Not allowed-----------only integers allowed");
                System.out.println("Enter another value for x : ");
                input.nextLine();
            }
        }

        System.out.print("Enter a value for y : ");

        while (condition) {

            try {
                // System.out.print("Enter a value for y : ");
                y = input.nextDouble(); //input mismatch
                condition = false;
            } catch (InputMismatchException e) {
                System.out.println("Not allowed here-----------integers only");
                System.out.println("Enter another value for y : ");
                input.nextLine();

            }


        }
        while (conditionzero){
            try {
                z=x/y ; // arithmetic exception
                System.out.println("The answer of the division is : " + z);
                conditionzero=false;
            } catch (ArithmeticException e) {
                System.out.println("Not allowed, division by zero");
                //may not be relevant  conditionzero =true;
            } finally {
                //   System.out.println("It will execute regardless");
            }
        }
        input.close();
    }
}
