package day15_StringandLoop;
import java.util.Scanner;
public class sumofnumbersEX2 {
//returns the total of five numbers
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number");
            total += scan.nextInt();


            System.out.println("total = " + total);
        }
        scan.close();
    }
}
