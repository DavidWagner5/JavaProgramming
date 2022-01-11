package day15_StringandLoop;
import java.util.Scanner;
/* 1. write a program to verify if the gmail is valid
            requirments:
                    a valid gmail account should end with @gmail.com */
public class lunchTask1EX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input email");

        String email = scan.next();
        boolean email1 = email.toLowerCase().endsWith("@gmail.com");

        if(email1){
            System.out.println("Valid email");
        }else{
            System.out.println("invalid email");
        }

        scan.close();


    }
}
