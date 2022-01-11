package day19_LoopPractices;

import java.util.Scanner;

public class CalculatorExitMethodEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = scan.nextInt();

        System.out.println("Enter a math operator");
        char operator = scan.next().charAt(0);

        if (!(operator == '+' || operator == '-')) {
            System.err.println("Invalid operator: " + operator);
            System.exit(0);


        }
        System.out.println("Enter second number");
        int num2 = scan.nextInt();


    }
}
