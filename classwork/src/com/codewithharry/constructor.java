package com.codewithharry;

public class constructor {

        String First_Name="seyram";
        String Last_Name="Harrison";
        String Department="Computer Science and Engineering";
        String Hall="GOD Hall";
        int Year=2;
        double CWA=90.25;
        int Age=12;
        String Gender="male";
        String Course="Java";
        String Hometown="USA";
        int  Index_Number=9015;
        constructor()
        {
        }
        constructor(String fn,String ln)
        {
            First_Name=fn;
            Last_Name=ln;
        }
        constructor(String fn,String ln,int a)
        {
            First_Name=fn;
            Last_Name=ln;
            Age=a;
        }
        constructor(String fn,String ln,int a, double cwa,String g,String c,String d, String h,int i,int y,String ht)
        {
            First_Name=fn;
            Last_Name=ln;
            Age=a;
            CWA=cwa;
            Gender=g;
            Course=c;
            Hall=h;
            Department=d;
            Index_Number=i;
            Year=y;
            Hometown=ht;


        }
        void setFirst_Name(String fn)
        {
            First_Name=fn;
        }
        void setLast_Name(String ln)
        {
            Last_Name=ln;
        }
        void setDepartment(String d)
        {
            Department=d;
        }

        void setCourse(String c) {
            Course = c;
        }
        void setYear(int y){
            Year=y;
        }

        void setHometown(String h) {
            Hometown = h;
        }
        void setAge(int a){
            Age=a;
        }
        void setHall(String h){
            Hall=h;
        }
        void setCWA(double cwa)
        {
            CWA=cwa;
        }
        void setGender(String g)
        {
            Gender=g;
        }
        void setIndex_Number(int i)
        {
            Index_Number=i;
        }
        String First_name(){return First_Name;}
        String Last_name(){return Last_Name;}
        String department(){return Department;}
        String hall(){return Hall;}
        int year(){return Year;}
        double wc(){return CWA;}
        int age(){return Age;}
        String gender(){return Gender;}
        String course(){return Course;}
        String hometown(){return Hometown;}
        double  Index(){return Index_Number;}
    }


