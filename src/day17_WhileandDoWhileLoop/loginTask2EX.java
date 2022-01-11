package day17_WhileandDoWhileLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class loginTask2EX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <=3 ; i++) {
            System.out.println("Enter your username");
            String username = scan.next();
            System.out.println("Enter your password");
            String password = scan.next();

            int attempts = 0;

            if(username.equals("CYDEO") && password.equals("CYDEO123")){
                System.out.println("Logged in");
                break;
            }else {
                attempts=3;
                System.out.println("Try again");
            }
            if(i==3){
                System.out.println("Your account is locked");
            }
        }
    }
}












