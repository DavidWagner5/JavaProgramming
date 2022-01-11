package day18_NestedLoop;

import java.util.Scanner;

public class EvenorOddNestedLoopEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);





        while (true) {

            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("even");
            } else if (num % 3 == 0) {
                System.out.println("odd");
            }

            System.out.println("would you like to enter another number?");
            String a = scan.next();
            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid Entry, Please re enter.");
                a = scan.next();
            }

            if (a.equals("no")) {
                break;


            }
        }
    }
}
