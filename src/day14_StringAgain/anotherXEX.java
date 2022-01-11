package day14_StringAgain;
import java.util.Scanner;
/*1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex */
public class anotherXEX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your word");
        String word = scan.nextLine();
        char w1 = word.charAt(0);
        String result = "";

        if(w1=='x'){
             result = word.replaceFirst("x" , "a");



        }else{
            result = "invalid";

        }

        System.out.println(result);


        }




        }


