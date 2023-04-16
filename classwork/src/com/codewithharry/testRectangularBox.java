package com.codewithharry;

public class testRectangularBox {
    public static void main(String[] args) {
        RectangularBox rec1=new RectangularBox();
        System.out.println(rec1.breadth);
        System.out.println(rec1.height);
        System.out.println(rec1.length);

        RectangularBox rec2=new RectangularBox(25,60);
        System.out.println(rec2.length);
        System.out.println(rec2.height);
        System.out.println(rec2.breadth);

        RectangularBox rec3 =new RectangularBox(25,60,30);
    }
}
