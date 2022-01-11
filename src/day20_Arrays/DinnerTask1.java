package day20_Arrays;

import java.util.Arrays;

/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */
public class DinnerTask1 {
    public static void main(String[] args) {

        String classmates [] = {"David Wagner" , "Raluca Ilut" , "Steve loev"};
        String result = "";

        for (int i = 0; i < classmates.length; i++) {
            result += " " + classmates[i].substring(0 , 1)+"."+classmates[i].charAt(classmates[i].indexOf(" ")+1) + ".";

        }


        System.out.println(result);


    }
}
