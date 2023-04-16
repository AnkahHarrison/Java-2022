package com.codewithharry;

import java.util.Scanner;

public class timeConversion {  public static void main(String[] args) {
    //scanner to read total time in seconds
    Scanner input =new Scanner(System.in);
    System.out.println("Enter time in seconds");
    //create variable to store timeEntered
    int timeEntered =input.nextInt();

    //get total mins form timeEntered
    int totalMins =timeEntered/60;

    }
}






