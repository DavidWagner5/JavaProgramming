package day14_StringAgain;
import java.util.Scanner;
/*2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind" */

public class NevermindEX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = scan.nextLine();
        String word2 = word.substring(word.length()-2);
        String result = "";

        if (word2.equals("ly")) {
            result = "Really???";
        } else {
            result = "nevermind";


        }

        System.out.println(result);

    }




    }




