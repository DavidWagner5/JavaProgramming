package day18_NestedLoop;
/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
*/


import java.util.Scanner;

public class OperatorTaskEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int result = 0;

        while(true){
            System.out.println("enter first num");
            int num1 = scan.nextInt();
            System.out.println("enter operator");
            char operator = scan.next().charAt(0);


            while(!(operator=='+'|| operator=='-' || operator=='*' || operator=='/')){
                System.out.println("Invalid operator, please select a valid operator");
                operator = scan.next().charAt(0);
            }

            System.out.println("Enter a second number");
            int num2 = scan.nextInt();

            result = (operator=='+')? (num1 + num2): (operator=='-')? (num1-num2): (operator=='*')? (num1*num2): (num1/num2);
            System.out.println(result);

            System.out.println("Would you like to continue?");
            String a = scan.next();

            while(!(a.equals("yes")||a.equals("no"))){
                System.out.println("re enter, invalid entry");
            }

            if(a.equals("no")){
                System.out.println("Thanks for using cydeo calculator!");
                break;
            }scan.close();


        }


    }

}
