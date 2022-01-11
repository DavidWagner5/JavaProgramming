package day15_StringandLoop;
import java.util.Scanner;
//write a program that asks the user to enter a number 5 times
//return the maximum number
public class MaximumNumberEXIMPORTANT {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//scanner is outside loop because it does not need to be repeated

        int max = -2147483648;//this was assigned because we wanted the lowest number possible for int. any number will be greater than this


        for (int i = 0; i < 5; i++) {//this is just saying, hey we're gonna make u input 5 things in scanner because 0-5 is 5 times. you could even do 5000 and 5005 to have 5 repeats
            System.out.println("enter a number");
            int num = scan.nextInt();

            if (num > max) {//if the user enters a number greater than the current maximum number
                max = num;

            }


        }scan.close();
        System.out.println("max = " + max);
    }
}
