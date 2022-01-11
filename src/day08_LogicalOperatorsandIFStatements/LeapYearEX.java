package day08_LogicalOperatorsandIFStatements;

public class LeapYearEX {


    /*
    2. create a class named LeapYear, and write a program that can identify if the given year is leap Year, print true if it's leap year, otherwise print false

	        Ex:
	             if  year = 2020

	            output:
	                2020 is leap year: true

        Hint: if the number of year can be evenly divisible by 4 (with remainder of zero)*/

    public static void main(String[] args) {
        int year = 200;
        boolean isLeapYear = year % 4 ==0;

        System.out.println(year + "is leap year: " + isLeapYear);
    }
}
