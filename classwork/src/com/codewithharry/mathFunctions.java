package com.codewithharry;

public class mathFunctions {
    public static void main(String[] args) {
//        System.out.println("Constants in Java");
//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//        System.out.println(2*Math.PI*3.15);
        //TRIG FUC IN JAVA
//        System.out.println("TRIG FUNCTION IN JAVA");
//        System.out.println(Math.sin(90));//this is not right sin cos tan can take the values in degree
//        //nb degree needs to be converted to radians first
//        System.out.println(Math.sin(Math.toRadians(90)));
//        System.out.println(Math.cos(Math.toRadians(90)));
//        System.out.println(Math.tan(Math.toRadians(90)));

        //assignment asin ,atan,acos on your own
//        System.out.println(Math.exp(5));//exponential function
//        System.out.println(Math.log(20));//natural log
//        System.out.println(Math.log10(20));//log base 10
//        System.out.println(Math.pow(7,3));//power function
//        System.out.println(Math.sqrt(25));//square root of 25
//        System.out.println(Math.cbrt(25));//cube root of 27
//        System.out.println(Math.pow(27,1.0/3));//cube root of 27
        System.out.println("rounding methods in java");
        System.out.println("round"+Math.round(89.7952));//rounds to the nearest integer
        System.out.println("round"+Math.round(89.1952));//rounds to the nearest integer
        System.out.println("rint"+Math.rint(89.7952));//rounds to the nearest integer
        System.out.println("rint"+Math.rint(89.1952));//rounds to the nearest integer
        System.out.println("ceil"+Math.ceil(89.7952));//rounds to the nearest integer
        System.out.println("ceil"+Math.ceil(89.1952));//rounds to the nearest integer
        System.out.println("floor"+Math.floor(89.7952));//rounds to the nearest integer
        System.out.println("floor"+Math.floor(89.1952));//rounds to the nearest integer
//        //a code  to round 0.33333 in java
        System.out.println(Math.round((1.0/3)*1000.0)/1000.0);
//        //MAX ,MIN ,ABS FUNCTION IN JAVA
        System.out.println("MAX ,MIN ,ABS FUNCTION IN JAVA");
        System.out.println(Math.max(0.1575,-0.12564));//max of two numbers
        System.out.println(Math.min(0.1575,-0.12564));//min of two numbers
//         how to determine the numbers the maximum of three numbers
        System.out.println(Math.max(0.1575,Math.max(-0.12564,0.2567)));//max of three numbers
//        //random number generator
        System.out.println("random number generator");
        double randomNumber =Math.random();
        System.out.println(randomNumber);
        System.out.println(randomNumber*5);//random number between 0 and 5
//        System.out.println((int)(randomNumber*5));
//        //to exclude zero in random number generated
//        System.out.println((int)(randomNumber*5)+1);
//       // System.out.println(Math.random());//random number between 0 and 1

    }

}



