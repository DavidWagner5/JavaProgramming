package day13_String;
import java.util.Scanner;
public class CharInitialsEX {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);

        System.out.println("enter first name");
        String firstName = scan.nextLine();


        System.out.println("enter last name");
        String lastName = scan.nextLine();

        char f = firstName.charAt(0);//the 0 is the first character of my first name. it will be D
        char l = lastName.charAt(0);//the 0 is the first character of my last name. it will be W

        String initial = f+ "." +l + ".";

        System.out.println(initial);

        scan.close();



    }
}
