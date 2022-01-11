package day19_LoopPractices;

import java.util.Scanner;

public class OddOrEvenEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd Number");
            }

            while(!(num > 0 ) && num<500){
                System.err.println("invalid entry: redo it");
                num = scan.nextInt();
            }

            System.out.println("Would you like to enter another number?");
            String a = scan.next();

            if(!(a.equals("yes") || a.equals("no"))){
                System.exit(0); //this will just terminate the program immediately.
            }

            if(a.equals("no")){
                break;
            }



        }
    }
}
