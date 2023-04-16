import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        String name = "Harry";
        String hometown = "New York";

        System.out.println("My name is " + name + " and I am from " + hometown);
        System.out.println(name +"is of length "+name.length());
        System.out.println(name+" in uppercase is "+name.toUpperCase(Locale.ROOT));
        System.out.println(name+" in lowercase is "+name.toLowerCase());

        //comparing strings
        String FirstName = "Harry";
        String Surname = "HARRY";
        System.out.println(FirstName+" is equal to "+Surname+" "+FirstName.equals(name));
        System.out.println(FirstName.equals(Surname));//case sensitive
        System.out.println(FirstName.equalsIgnoreCase(Surname));//ignores case
        System.out.println(FirstName.compareTo(Surname));//compares the strings
        System.out.println(FirstName.contains("rry"));//checks if the string contains the given string
        System.out.println(FirstName.startsWith("Ha"));//checks if the string starts with the given string
        System.out.println(FirstName.endsWith("y"));//checks if the string ends with the given string
        System.out.println(FirstName.indexOf("rry"));//returns the index of the given string
        //substrings,end with   //starts with





    }
}
