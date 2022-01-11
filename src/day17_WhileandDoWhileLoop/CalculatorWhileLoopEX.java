package day17_WhileandDoWhileLoop;

import java.util.Scanner;

public class CalculatorWhileLoopEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = scan.nextInt();
        System.out.println("enter your second number");
        int num2 = scan.nextInt();
        System.out.println("Enter a math operator");
        char operator = scan.next().charAt(0);

        while (!(operator == '+' || operator== '-') ){
            System.err.println("invalid operator, please re enter");  //serr just makes an error message.
            operator = scan.next().charAt(0);


        }
        if(operator=='+'){
            System.out.println(num1+num2);
        }else{
            System.out.println(num1-num2);
        }scan.close();
    }
}
