package day13_String;
import java.util.Scanner;
/*
2. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output*/
public class ReturnInitialsEX {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = scan.nextLine();

        System.out.println("Enter Last name");
        String lastName = scan.nextLine();
        
        char f = firstName.charAt(0);
        char l = lastName.charAt(0);
        
        String initial = f + "." + l + ".";

        System.out.println("initial = " + initial);

        scan.close();






    }
}
