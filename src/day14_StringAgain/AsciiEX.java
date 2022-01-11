package day14_StringAgain;
import java.util.Scanner;

/*   5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table */
public class AsciiEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = scan.nextLine();
        char FirstCharacter = word.charAt(0);
        String result = "";

        if(FirstCharacter >=47 && FirstCharacter<=57){
            result = "First character is digit";

        }else if(FirstCharacter >= 65 && FirstCharacter <=90){
            result = "First Character is uppercase";
        }else if(FirstCharacter >=97 && FirstCharacter<=122){
            result = "First Character is lowercase";
        }else{

            result = "Starts with Special character";

            System.out.println("result = " + result);

            scan.close();
        }


    }
}
