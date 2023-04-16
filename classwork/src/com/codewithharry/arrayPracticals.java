package com.codewithharry;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayPracticals {

    //create a single dimensional array for 5 elements of doubles
    public static void main(String[] args) {
       double []  marks=new double [5];
//        double marks [] =new double [5];
       // int array
        int [ ] newmarks=new int[3];
        // sd of sting that takes element
       String stdNames [] =new String[10];

       //create a sd array of double with initial values
        double marks3[]={20.3,20,0.1};
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(newmarks));
        System.out.println(Arrays.toString(stdNames));
        System.out.println(Arrays.toString(marks3));


        //not recommended
        newmarks[0]=50;
        newmarks[1]=68;
        newmarks[2]=80;
//        newmarks[3]=59;

//addition content to sd array using a loop
        //string array
        for(int i=0; i<stdNames.length;i++)
            stdNames[i]="student"+(i+1);
        //adding content to sd array
        for(int i=0;i<marks.length; i++){
            //at index i,add (i+2)*(Math.pow(i,3))
            marks[i]=(i+2)*(Math.pow(i,3));

//            try {
//                for (int k=0;k<=marks.length;k++) {}
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }

//COPY A SD ARRAY IN JAVA POINTING TO THE SAME DATA
            //MODIFICATION OF ORIGINAL ARRAY AFFECTS ITS COPY AND VICE VERSA
            System.out.println("before copy");
            double copiedMarks []=marks;
            System.out.println(Arrays.toString(marks));
            copiedMarks[0]=99;
            System.out.println("after copy and modification");
            System.out.println(Arrays.toString(marks));
            System.out.println(Arrays.toString(copiedMarks));

            //cloning and array so that modifications does not affect the other
            System.out.println("before copy");
            System.out.println(Arrays.toString(marks));

            double cloneMarks []=marks.clone();
            cloneMarks[0]=22;
            marks[1]=333;
            System.out.println("after clone and modification");
            System.out.println(Arrays.toString(marks));
            System.out.println(Arrays.toString(cloneMarks));



        }
//        System.out.println(Arrays.toString(marks));
//        System.out.println(Arrays.toString(newmarks));
//        System.out.println(Arrays.toString(stdNames));
//        System.out.println(Arrays.toString(marks3));
//


    }
//    System.out.println(Arrays.toString(stdNames));

}
