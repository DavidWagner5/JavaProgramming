package day19_LoopPractices;
/*	1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task */

import java.util.Scanner;

public class PerimeterofCircleEX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println("Enter radius of circle");
            int r = scan.nextInt();

            if(r<=0){
                System.err.println("Invalid entry, see ya later");
                System.exit(0);
            }

            double diameter = 2*r;
            double area = 3.14 * r * r;
            double perimeter = 2 * 3.14 * r;

            System.out.println(diameter + "\n" + area + "\n" + perimeter);

            System.out.println("Woudl you like to calculate another circle?");
            String a = scan.next();
            while(!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))){
                System.out.println("invalid entry, please select again");
                a = scan.next();
            }

            if(a.equalsIgnoreCase("no")){
                System.out.println("Thank you for using this calculator");
                break;
            }
        }
    }
}
