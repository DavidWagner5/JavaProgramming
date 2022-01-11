package day13_String;
/*1. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same*/
import java.util.Scanner;
public class FirstandLastEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your word");
        String word = scan.nextLine();

        boolean same = word.charAt(0) == word.charAt(word.length()-1);

        if(same){
            System.out.println("They are the same");

        }else{
            System.out.println("They are not the same");

            scan.close();
        }

    }
}
