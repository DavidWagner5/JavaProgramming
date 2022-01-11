package day17_WhileandDoWhileLoop;

import java.util.Scanner;

public class BranchingStatementsBreakStatementCL {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z' ; i++) {
            if(i=='F'){
                break;
            }
            System.out.println(i+ " ");   //it exits the loop at F

        }

        System.out.println("---------------");

        Scanner scan = new Scanner(System.in);

            while(true){
                System.out.println("Enter a number");
                int num = scan.nextInt();

                if (num<0){
                    break;
                }
            }
        }


    }

