package day23_CustomMethod;
import java.util.Scanner;
public class CustomMethodDinnerTask11 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your first name in any format");
        String firstName = scan.nextLine();
        System.out.println("Please enter your last name in any format");
        String lastName = scan.nextLine();

        formatFullName(firstName,lastName);

    }
    public static void formatFullName ( String firstName, String lastName){

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();


        System.out.println();
        System.out.println( "Full Name is " +firstName+ " "+ lastName);

    }
}

