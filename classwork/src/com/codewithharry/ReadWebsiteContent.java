package com.codewithharry;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class ReadWebsiteContent {
    public static void main(String[] args) {
        String url = "https://umat.edu.gh/";
        try {
            URL website = new URL(url);
            Scanner scanner = new Scanner(website.openStream());//
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                PrintWriter outputFile=new PrintWriter("pilot.txt");
                outputFile.println(line);
                outputFile.close();
                System.out.println(line);
            }
            scanner.close();
        } catch (IOException e) {
            System.err.println("Error reading website content: " + e.getMessage());
        }
    }
}