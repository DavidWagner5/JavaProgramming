package day18_NestedLoop;

import java.util.Scanner;

public class LoginForLoopEX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your usename");
        String U = scan.next();
        System.out.println("Please enter your password");
        String P = scan.next();

        if(U.equals("Cydeo")&& P.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{
            for (int i = 1; i <3 ; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Please enter your usename");
                U = scan.next();
                System.out.println("Please enter your password");
                P = scan.next();

                if(U.equals("Cydeo")&& P.equals("WoodenSpoon")){
                    System.out.println("Logged in");
                    break;
                }


            }

            if(!(U.equals("Cydeo")&& P.equals("WoodenSpoon"))){
                System.err.println("Your account is locked");
            }scan.close();


        }

    }
}


