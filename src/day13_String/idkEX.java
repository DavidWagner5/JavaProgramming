package day13_String;
import java.util.Scanner;
/*5. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length*/
public class idkEX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");
        String word1 = scan.nextLine();

        System.out.println("Enter your second word");
        String word2 = scan.nextLine();

        System.out.println("Enter your third word");
        String word3 = scan.nextLine();


        int word1length = word1.length();
        int word2length = word2.length();
        int word3length = word3.length();

        if(word1length==word2length && word2length==word3length){
            System.out.println("All words are the same length");
        }else if(word1length==word2length && word2length != word3length){
            System.out.println("not same nor different lengths");
        }else{
            System.out.println("all different lengths");
        }
        scan.close();

    }
}
