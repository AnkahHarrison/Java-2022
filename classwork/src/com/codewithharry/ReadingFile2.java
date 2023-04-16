package com.codewithharry;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile2 {
    public static void main(String[] args) {
        File inputFile = new File("test.txt");
        Scanner input = null;
        try {
            input = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        while (input.hasNext()) {

            //check if that next is an int//
            //double ,boolean or string
            if (input.hasNextInt()) {
                int i = input.nextInt();
                System.out.println(i + "is an int");

            } else if (input.hasNextDouble()) {
                double j = input.nextDouble();
                System.out.println(j + "is a double");
            } else if (input.hasNextBoolean()) {
                boolean k = input.nextBoolean();
                System.out.println(k + "is an Boolean");

            } else {
                String str = input.next();
                System.out.println(str + "is a string");

            }
        }
        input.close();
    }
}

 //input =new Scanner(inputFile);
//System.out.println("file not found");