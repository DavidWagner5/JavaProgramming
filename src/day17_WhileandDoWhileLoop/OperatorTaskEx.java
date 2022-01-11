package day17_WhileandDoWhileLoop;
/*. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)*/
import java.util.Scanner;

public class OperatorTaskEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first num");
        int num1 = scan.nextInt();
        System.out.println("Enter second num");
        int num2 = scan.nextInt();
        System.out.println("Enter operator"); // * - * /
        char operator = scan.next().charAt(0);

        while (!(operator == '*' || (operator == '-' || (operator == '+' || operator == '/')))){
            System.out.println("re-enter operator,invalid");
            operator = scan.next().charAt(0);


        }
        System.out.println((operator == '+') ? num1 + num2 : (operator == '-') ? num1 - num2 : (operator == '*') ? num1 * num2
                : num1 / num2);



        }


    }


