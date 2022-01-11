package day13_String;
/*1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence

    2. write a program that asks user to enter two strings, and print out the longest string */
import java.util.Scanner;
public class StringTasksEX {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = input.nextLine();
        char firstChar = sentence.charAt(0);
        char lastChar =sentence.charAt(sentence.length() -1);

        System.out.println("firstChar = " + firstChar);
        System.out.println("lastChar = " + lastChar);
        input.close();


    }

}




