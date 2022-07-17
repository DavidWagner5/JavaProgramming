package day42_ExeptionsContinued;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();



        if(age < 0){
            throw new InputMismatchException("invalid age");
        }

        if(age >= 21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            throw new InputMismatchException("You must be at least 21 years old");
        }


    }
}
