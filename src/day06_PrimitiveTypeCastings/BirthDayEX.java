package day06_PrimitiveTypeCastings;

/* 1. Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995. */


public class BirthDayEX {
    public static void main(String[] args) {

        String name = "John";
        int birthDay = 25;
        String birthMonth = "April";
        int birthYear = 1995;
        String bookName = "Star Was: Master and Apprentice";

        System.out.println(name + " was born on " +birthMonth+ "/" +birthDay+ "/" +birthYear);

        System.out.println("My favorite book is " +bookName+ ".");




    }
}
