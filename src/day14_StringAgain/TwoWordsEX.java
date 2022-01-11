package day14_StringAgain;
import java.util.Scanner;

/*1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana  */
public class TwoWordsEX {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");
        String firstWord = scan.nextLine();

        System.out.println("Enter you second word");
        String secondWord = scan.nextLine();

        String w1 = firstWord.substring(1);
        String w2 = secondWord.substring(1);

        System.out.println(w1 + w2);

        scan.close();


}
}
