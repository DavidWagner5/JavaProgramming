package day16_LoopandString;
import java.util.Scanner;
//write java in reverse
public class reverseStringEX {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += str.charAt(i);

            scan.close();

        }

        System.out.println("reverse = " + reverse);
        System.out.println("str = " + str);


    }


    }



