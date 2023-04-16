package com.codewithharry;

public class NumericTypeCasting {
    public static void main(String[] args) {
        //numeric data types
        int age = 18;
        double height =1.83;
        //string variables
        String weight ="78.09451";

        String weight2 ="78";

        double newAge =age;

        //double as an integer
        int newHeight= (int)height;
        double weightDec =Double.parseDouble(weight);
        double weightInt= Integer.parseInt(weight2);

        System.out.println(newAge +"as a double from int");
        System.out.println(newHeight +"as a double from double");

        System.out.println(weight);
    }
}
