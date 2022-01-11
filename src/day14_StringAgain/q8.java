package day14_StringAgain;
import java.util.Scanner;
public class q8 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("enter 1");

        byte b1 = userInput.nextByte();

        System.out.println("Enter 2");

        byte b2 = userInput.nextByte();

        int max = (b1>b2) ? b1 +2 : b2 - 4;
        System.out.println(max);

    }
}
