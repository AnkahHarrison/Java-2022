package com.codewithharry;

import java.util.Scanner;

public class details {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your name");
        String name =input.nextLine();
        double age= input.nextDouble();
        System.out.println("welcome "+name+"you are "+ age +" years old");
    }

}
