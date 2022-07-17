package day20_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

/*1. create an array that has the numbers 1 to 100 */
public class oneto100O {
    public static void main(String[] args) {

     int arr [] = {1,2,3,4,50,0,0,6,5,7};

     int newArray[] = new int [arr.length];

     int count = 0;

     for (int number : arr){

         if(number != 0){

             newArray[count] = number;

             count++;
         }


     }
        System.out.println(Arrays.toString(newArray));
    }
}
