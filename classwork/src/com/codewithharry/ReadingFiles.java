package com.codewithharry;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) throws FileNotFoundException {
        //Reading a Text file in project file
        File inputFile =new File("test.txt");
        File fileTODelete=new File("test1.txt");
        File desktopFile=new File("C:\\Users\\SEYRAM\\Desktop\\testDesktop.txt");
        //check methods for file variable
        System.out.println(inputFile.exists());
        System.out.println(inputFile.getAbsolutePath());
        System.out.println(inputFile.length());
        System.out.println(inputFile.isHidden());
        fileTODelete.delete();

        // reading input from the file
        Scanner input =new Scanner(inputFile);
        //lOOP to print line by le
        while (input.hasNext()){
            System.out.println(input.nextLine());

        }
input.close();

    }
}
