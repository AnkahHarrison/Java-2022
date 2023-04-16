package com.codewithharry;

import java.util.Scanner;

public class umatGrade {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your UMAT score");
        double score =input.nextDouble();

        if ((score >100.00)||(score<0.0)){
            System.out.println("Invalid score");
        }
        else {
            if (score>=80.0){
                System.out.println(score+"You are in first class");
            }
            else if ((score>=70.0) && (score<80.0)){
                System.out.println(score+"You are in 2nd class upper");


            }
            else if( (score>=60.0)&&(score<70.0)){
                System.out.println(score+"You are in 2nd class lower");


            }
            else if ((score>=50.0) && (score<60.0)){
                System.out.println(score+"You are in 3rd class");


            }
            else if ((score>=40.0) && (score<50.0)) {
                System.out.println(score + "You are in pass");
            }

        }






    }
}
