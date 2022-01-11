package day09_IFandElsestatements;

public class LeapYearifandelseEX {

    public static void main(String[] args) {

        int year = 2000;

        boolean isLeapYear = 200 % 4 ==0;


        if(isLeapYear){
            System.out.println("is a leap year");
        }
        if(!isLeapYear){
            System.out.println("not a leap year");
        }
        //------------------------------------------------

        if(isLeapYear){
            System.out.println(" is a leap year");
        }else{
            System.out.println("is not a leap year");
        }
    }
}
