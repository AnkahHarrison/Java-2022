import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class writingFiles {
    public static void main(String[] args) throws FileNotFoundException {
        //PRINTWRITER IS USED TO CREATE A FILE WRITE TO A
        PrintWriter outputFile=new PrintWriter("pilot.txt");
        outputFile.println("hello");
        outputFile.close();
    }

}
