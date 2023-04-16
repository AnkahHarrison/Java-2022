package com.codewithharry;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        String inputFileName = "ASSIGNMENT.txt";
        String outputFileName = "out.txt";
        try {
            File inputFile = new File(inputFileName);
            Scanner scanner = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter(outputFileName);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.println(line.toUpperCase());
            }
            scanner.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        }
    }
}

