package day16_LoopandString;
import java.util.Scanner;
/*1. Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String 
                  Condition: the character is not contained in the other String yet before you are adding */
public class duplicateTaskEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your string");

        String str = scan.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) { //represents all of the index numbers of str from 0

            String ch = "" + str.charAt(i); //represents each character


            if (!result.contains(ch)) { //if the character is not contained in the result
                result += ch; //the character will be added to the result
            }



        }
        System.out.println("result = " + result);
    }
}

