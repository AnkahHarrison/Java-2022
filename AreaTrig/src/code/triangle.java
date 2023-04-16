package code;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        double b;
        double h;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a value for the base of the triangle");
        b= input.nextDouble();
        System.out.println("Enter a value for the height of the triangle");
        h= input.nextDouble();
        double Area = (b * h) / 2;
        System.out.println(Area);


    }
}

