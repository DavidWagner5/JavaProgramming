package day14_StringAgain;
import java.util.Scanner;
/*2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea */
public class replaceXEX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word"); //"xcodeX
        String word = scan.next();
        String result = "";

        result = word.replace("x" , "a").replace("X" , "a");

        System.out.println(result);

    }
}
