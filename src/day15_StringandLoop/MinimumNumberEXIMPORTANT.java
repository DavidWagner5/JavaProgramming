package day15_StringandLoop;
import java.util.Scanner;
//find the minimum input number
public class MinimumNumberEXIMPORTANT {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 2147483647;

        for (int i = 0; i < 5; i++) {

            System.out.println("enter your number");
            int num = scan.nextInt();

            if(num<min){
                min=num;

            }

        }scan.close();

        System.out.println("min = " + min);


    }
}
