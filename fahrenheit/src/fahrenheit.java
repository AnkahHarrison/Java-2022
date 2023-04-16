import java.util.Scanner;
public class fahrenheit {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius");
        double celsius =input.nextDouble();
//        double fahrenheit = (9/5 * celsius + 32);
        double fahrenheit = (1.8 * celsius) + 32;
        System.out.println("Celsius Values is: "+celsius+" and the  Fahrenheit is: "+fahrenheit);
    }
}
