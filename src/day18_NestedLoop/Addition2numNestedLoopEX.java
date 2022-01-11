package day18_NestedLoop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Addition2numNestedLoopEX {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        Integer p =1;
        System.out.println(list1.remove(p));

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your first number");
            int num1 = scan.nextInt();

            System.out.println("Enter your second number");
            int num2 = scan.nextInt();

            System.out.println("Addition " + (num1 + num2));

            System.out.println("Would you like to continue");
            String a = scan.next();

            while(!(a.equals("yes") || a.equals("no"))){
                System.err.println("invalid entry, please re enter");
                a = scan.next();
            }


            if(a.equals("no")){
                break;
            }scan.close();


        }
    }
}
