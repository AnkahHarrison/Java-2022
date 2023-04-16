package com.codewithharry;

public class RectangularBox {
    double length=1;
    double breadth=1;
    double height=20;

    RectangularBox(){
        //default constructor
    }

    /**
     * This method creates a rec box with user desired length and height;
     * @param l
     * @param h
     */
    RectangularBox(double l,double h){
        length=l;
        height=h;

    }
    RectangularBox(double l,double h,double b){
        length=l;
        breadth=b;
        height=h;
    }

    /**
     * This method overrides the original length l
     * @param l
     */
    void setLength(double l){
        length=l;

    }
    void setBreadth(double b){
        breadth=b;
    }
    void setHeight(double h){
        height=h;
    }

    double sideArea1(){
        return length*height;
    }
    double sideArea2(){
        return breadth*height;
    }
    //Assignment ,write the method for sideAREA3

    double volume(){
        return length*height*breadth;
    }
    double getLength(){


        return length;
    }

}
