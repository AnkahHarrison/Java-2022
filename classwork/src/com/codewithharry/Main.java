package com.codewithharry;

//public class reverseString {
//}
import java.util.Scanner;

//public class ReverseString {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String str = scanner.nextLine();
//
//        System.out.print("Reversed string: ");
//        for (int i = str.length() - 1; i >= 0; i--) {
//            System.out.print(str.charAt(i));
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the first integer: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Enter the second integer: ");
//        int num2 = scanner.nextInt();
//
//        int sum = num1 + num2;
//        int product = num1 * num2;
//        int difference = num1 - num2;
//        double quotient = (double)num1 / num2;
//
//        System.out.println("Sum: " + sum);
//        System.out.println("Product: " + product);
//        System.out.println("Difference: " + difference);
//        System.out.println("Quotient: " + quotient);
//    }
//}
//for (int i = 30; i <= 60; i++)
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 30; i <= 60; i++) {
//            if ((i % 3 == 0) ^ (i % 4 == 0)) {
//                System.out.println(i);
//            }
//        }
//    }
//}//

public class Main {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 11; i <= 25; i += 2) {
            product *= i;
        }
        System.out.println("Product of odd integers from 10 to 25: " + product);
    }
}

