package day14_StringAgain;
import java.util.Scanner;
/*Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code */
public class xEX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = scan.nextLine();

        if (word.charAt(0) == 'x'){ ;

            System.out.println(word.substring(1));

        }else{
            System.out.println(word);

        }
    }
}


