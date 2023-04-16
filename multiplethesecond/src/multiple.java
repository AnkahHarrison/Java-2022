import java.util.Scanner;
public class multiple {
    public static void main(String[] args) {
        // create a scanner to obtain input from the command window
        Scanner input =new Scanner(System.in);
        // create a variable to store the first number
        int number1;
        // create a variable to store the second number
        int number2;
        // create a variable to store the result
        int result;
        // read first number from the user
        System.out.println("Enter first integer:");
        number1 =input.nextInt();
        // read second number from the user
        System.out.println("Enter second integer:");
        number2 =input.nextInt();
        // determine if first is a multiple of second
        if (number2%number1==0)
            System.out.println(number1+" is a multiple of "+number2);
        else
            System.out.println(number1+" is not a multiple of "+number2);
    }
}
