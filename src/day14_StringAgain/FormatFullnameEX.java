package day14_StringAgain;
import java.util.Scanner;
/*3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output: */
public class FormatFullnameEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first name");
        String word1 = scan.nextLine();
        System.out.println("enter the last name");
        String word2 = scan.nextLine();

        String word11 = word1.substring(0 , 1).toUpperCase() + word1.substring(1).toLowerCase();

        System.out.println(word11);

        String word22 = word2.substring(0,1).toUpperCase() + word2.substring(1).toLowerCase();

        System.out.println(word22);

        System.out.println(word11 + " " + word22);

        scan.close();


    }
}
