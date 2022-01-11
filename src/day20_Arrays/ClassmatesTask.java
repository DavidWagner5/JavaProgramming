package day20_Arrays;
/*1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines */
public class ClassmatesTask {
    public static void main(String[] args) {

        String [] classmates = {"David Wagner" , "Niera Skrebo" , "Busra salamanci" , "Sergehi ghiu" , "Kevin nava" , "tarig muhammad" , "mert ozer" , "muhammat charrev" , "hulia keles" ,
                "raluca ilut"};

        String result = "";
        for (int i = 0; i < classmates.length; i++) {
            result+= ""+classmates[i].charAt(0)+classmates[i].charAt(classmates[i].indexOf(" ")+1)+", ";
        }

        System.out.println("result = " + result);

        }






    }

