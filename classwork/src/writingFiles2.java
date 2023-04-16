import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class writingFiles2 {
    public static void main(String[] args) throws FileNotFoundException {


        File inputFile = new File("test.txt");
        //PRINTWRITER IS USED TO CREATE A FILE WRITE TO A
        PrintWriter outputFile=new PrintWriter("ASSIGNMENT.txt");
        Scanner input = null;
        try {
            input = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        while(input.hasNextLine()){
            outputFile.println(input.nextLine());


        }
        outputFile.close();











    }
}
