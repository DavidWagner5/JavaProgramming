package day15_StringandLoop;
import java.util.Scanner;
/*2. write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov*/

public class lunchTask2EX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter website");
        String website = scan.next();
        boolean website1 = website.startsWith("www.") && website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov");

        if(website1){
            System.out.println("Valid website");
        }else{
            System.out.println("Not a valid website");
        }

        scan.close();



    }
}
