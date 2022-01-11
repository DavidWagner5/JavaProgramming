package day20_Arrays;

public class NameOfMonthEX {
    public static void main(String[] args) {

        String[] month = {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "August", "September","October", "November","December"};


        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]);

        }

        System.out.println("-------------------------");

        for (int i = month.length-1; i >=0 ; i--) {
            System.out.println(month[i]); //for backwards

        }

        }

    }

