package day07_Operators;

public class ShortHandOperatorsCL
//assignment, addition assignment, subtraction assignment, multiplication assignment, division assignment, remainder assignment
{
    public static void main(String[] args) {


        //ASSIGNMENT operator: x=y
        int number = 100;

        System.out.println("number = " + number);//100

        number = 200;

        System.out.println("number = " + number);

        String word = "Java Programming";
        System.out.println("word = " + word);
        
        word = "wooden spoon";

        System.out.println("word = " + word); //the variable was initialized again, so it overrides and takes wooden spoon instead of java programming
        
        //I can reassign it again
        
        word = "cydeo";

        System.out.println("word = " + word);
        
        
        //ADDITION assignment operator: x +=y
        
        int x = 100;
        //x = x + 200;
        x += 200;

        double num1 = 2.5;// let's try to get 8.0

        num1 += 5.5;

        System.out.println("num1 = " + num1);
        
        double availableBalance = 1000.50;
        
        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);

        //SUBTRACTION assignment operator:

        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);


        availableBalance +=400;
        System.out.println("availableBalance = " + availableBalance);
        
        //Multiplication operator
        
        double salary = 50000.50;
        salary *= 2;

        System.out.println("salary = " + salary);

       //division operator
        
        double num2 = 25000;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        //remainder operator

        double num3 = 100;
         num3 %=3;
        System.out.println("num3 = " + num3);

        int amount = 127;
        int quarters = amount/25;
        int cents = amount%25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        int y = 300;
        y %=16;   //this will find you the remainder of 300/16
        System.out.println("y = " + y);
        
        


        
    }
}
