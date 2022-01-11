package day20_Arrays;
/*1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines */
public class forlooptaskO {

    public static void main(String[] args) {

        String classmates [] = {"David Wagner" , "Natalie Rajch" , "Michael Burstein" } ;

        String result = "";

        for (int i = 0; i < classmates.length; i++) {
            result += classmates[i].substring(0,1);
            result += classmates[i].substring(classmates[i].indexOf(' ')+1,classmates[i].indexOf(' ')+2);
            result += " ";
        }
        System.out.println(result);


        }
    }

