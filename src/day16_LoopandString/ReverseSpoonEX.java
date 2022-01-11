package day16_LoopandString;
import java.util.Scanner;
/*

	7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW */
public class ReverseSpoonEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = scan.nextLine();
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {    //it starts at length()-1 which is the last character.  and then add charAt to i
            reverse += str.charAt(i);

            scan.close();



        }
        System.out.println("reverse = " + reverse);

    }
}
