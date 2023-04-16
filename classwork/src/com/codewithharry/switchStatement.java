package com.codewithharry;

import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        //The switch statement allows you to execute a block of code based on the value of a variable.
        //the year of birth using the chinese zodiac signs
        Scanner input =new Scanner(System.in);
        // ask the user to enter the year of birth
        System.out.println("Enter the year of birth");
        int yearOfBirth=input.nextInt();
        //calculate the age of the user
        switch (yearOfBirth%12){
            case 0:
                System.out.println("You were born in year of monkey");
                break;
            case 1:
                System.out.println("You were born in year of rooster");
                break;
            case 2:
                System.out.println("You were born in year of dog");
                break;
            case 3:
                System.out.println("You were born in year of pig");
                break;
            case 4:
                System.out.println("You were born in year of rat");
                break;
            case 5:
                System.out.println("You were born in year of ox");
                break;
            case 6:
                System.out.println("You were born in year of tiger");
                break;
            case 7:
                System.out.println("You were born in year of rabbit");
                break;
            case 8:
                System.out.println("You were born in year of dragon");
                break;
            case 9:
                System.out.println("You were born in year of snake");
                break;
            case 10:
                System.out.println("You were born in year of horse");
                break;

            default:
                System.out.println("You were born in year of sheep");
                break;
        }
    }

}
