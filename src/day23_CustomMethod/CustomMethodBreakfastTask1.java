package day23_CustomMethod;
/*1. Create a method that can display the initials of people in an array*/

public class CustomMethodBreakfastTask1 {
    public static void main(String[] args) {
intiials(new String []{"David Wagner", "Sully Bear", "xbox 360"});

    }

    public static void intiials(String name []){


        for (String each : name) {

            each = "" + (each.charAt(0)) + "." + each.charAt(each.indexOf(" ") + 1)+".";

            System.out.println(each);


        }

    }
}
