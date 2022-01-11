package day14_StringAgain;
import java.util.Scanner;

/* Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last word is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight */
public class OneEightEX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String result = "";
        System.out.println("Enter first word");
        String word1 = scan.nextLine();

        System.out.println("Enter second word");
        String word2 = scan.nextLine();
        char lastLetter = word1.charAt(word1.length()-1);
        char firstLetter = word2.charAt(0);

        if(lastLetter == firstLetter){
            System.out.println(word1+ word2.substring(1));




        }else{
            System.out.println("invalid");
        }


    }
}
