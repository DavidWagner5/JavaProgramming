package PracticeTasks;

import java.util.Scanner;

/*81.Write a program that can calculate the area and perimeter of a circle:
            a. Ask the user "Enter the radius of the circle:"
                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

            b. Display:
                    1. Diameter of circle
                    2. Area of circle
                    3. Perimeter of circle

            c. Ask the user "Would you like to calculate another circle?"
                    If "yes" --> repeat the previous steps
                    If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"  */
public class circleTask {
    public static void main(String[] args) {


        int radius = 0;
        int diameter = 0;
        double area = 0;
        double perimeter = 0;
        double pi = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius = scan.nextInt();



        while(true){


            if(radius<=0){
                System.err.println("invalid entry");
                System.exit(0);

            }

            if(radius>0){
                diameter = 2* radius;
                area = radius*radius * pi;
                perimeter = 2 * radius * pi;

                System.out.println(diameter + "\n" + area + "\n" + perimeter);



            }

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


