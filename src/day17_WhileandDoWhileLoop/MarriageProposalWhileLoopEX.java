package day17_WhileandDoWhileLoop;

import java.util.Scanner;

public class MarriageProposalWhileLoopEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String Answer = scan.next();

        while(!(Answer.equalsIgnoreCase("yes") || Answer.equalsIgnoreCase("no") )){
            System.err.println("invalid answer, please re enter");
            Answer = scan.next();


    }
        if(Answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }scan.close();
}
}
