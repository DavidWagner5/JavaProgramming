package day09_IFandElsestatements;
/*2. Create a class named NumberOfDays,
an integer variable named month that has numbers 1 ~12 is given to you,
write a program that can find the number of days in the given number of month.

            EX:
                month = 5

            output:
                31 days

            (Assume that February has 28 days)*/

public class NumberDaysEX {
    public static void main(String[] args) {
        int Monthnumber = 6;
        boolean has28Days = Monthnumber ==2;
        boolean has30Days =Monthnumber == 4 || Monthnumber == 6 || Monthnumber == 9 || Monthnumber == 11;
        boolean has31Days = !has28Days && !has30Days;


        if(has28Days){
            System.out.println("Has 28 Days");

        }else if(has30Days){
            System.out.println("Has 30 Days");
        }else if(has31Days){
            System.out.println("Has 31 Days");
        }else{
            System.out.println("None are correct");
        }


    }
}
