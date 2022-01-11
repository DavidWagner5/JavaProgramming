package day13_String;
import java.util.Scanner;
/* 2. write a program that asks user to enter two strings, and print out the longest string */
public class StringTaskEX {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your first string");
        String first = scan.nextLine();

        System.out.println("Enter your second string that is longer");
        String second = scan.nextLine();

        int firstlength = first.length();
        int secondlength = second.length();

        if(firstlength<secondlength){
            System.out.println(second);

        }else{
            System.out.println(first);
        }


    }
}
