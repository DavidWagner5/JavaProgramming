package day17_WhileandDoWhileLoop;

import java.util.Scanner;

public class EligibleToVoteWhileLoopEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter age of person");
        int age = scan.nextInt();

        while (!(age>=1 && age <=120)){
            System.err.println("Invalid age, re enter");
            age = scan.nextInt();
        }

        System.out.println("Are you a US Citizen?");
        String answer = scan.next();

        while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid answer, re enter");
            answer = scan.next();
        }

        if(age>=18 && answer.equalsIgnoreCase("yes")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("not eligible to vote");
        }scan.close();




        }
    }

