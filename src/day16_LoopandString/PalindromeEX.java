package day16_LoopandString;
import java.util.Scanner;
//java--> avaj not palindrome
//Anna--> annA palindrome
public class PalindromeEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your word");
        String word = scan.nextLine();  //Level

        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);
        }


            if (word.equalsIgnoreCase(reversed)) {  //or boolean isPalindrome = word.equalsIgnoreCase(reversed);
                System.out.println("Equal");
            } else {
                System.out.println("Not equal");
            }


    }
}
