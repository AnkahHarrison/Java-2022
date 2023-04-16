package com.codewithharry;

import java.util.Scanner;

public class timeConversion2 {
    public static void main(String[] args) {

            //scanner to read total time in seconds
            Scanner input =new Scanner(System.in);
            System.out.println("Enter time in seconds");
            //create variable to store timeEntered
            int timeEntered =input.nextInt();

            //get total mins form timeEntered
            int totalMins =timeEntered/60;
            //get remaining seconds from time entered
        //after extracting
            int remainSec =timeEntered%60;
            //get total hours from totalmins
            int totalHrs =totalMins%60;
            int remainMins=totalMins%60;

        System.out.println(timeEntered+"sec(s) is:" +totalHrs+"hr(s)"+remainMins+"min(s)"+remainSec+"sec(s)" );

        input.close();
    }
}
