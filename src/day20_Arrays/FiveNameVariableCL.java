package day20_Arrays;

import java.util.Arrays;

public class FiveNameVariableCL {
    public static void main(String[] args) {

        String [] myGroup = new String [5];
        myGroup[0] = "yulia m";
        myGroup[1] = "David";
        myGroup[2] = "suat";
        myGroup[3] = "mikkael";
        myGroup[4] = "Muhtar";

        //System.out.println(myGroup); //this is the wrong way of printing an array, it gives hashcode.

        System.out.println(Arrays.toString(myGroup));  //Arrays enter for java.util and then to string


        //default values for all non primitives: "null"
        //for primitives like byte short int long the default value is: "0"
        //for float and double = "0.0"
        //for boolean it is = "false


        System.out.println("---------------------------");

        String[] days= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(Arrays.toString(days));

        int number = 5;

        if(number <1 || number >7){
            System.err.println("Invalid num");
            System.exit(0);
        }

        System.out.println(days[number - 1]); // now you will get friday, becasue first idex of array is 0
    }
}
