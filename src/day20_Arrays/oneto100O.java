package day20_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

/*1. create an array that has the numbers 1 to 100 */
public class oneto100O {
    public static void main(String[] args) {

        int array [] = new int [100];
        int start = 1;

        for (int i = 0; i < array.length; i++) {

            array[i] = start++;



        }
        System.out.println(Arrays.toString(array));;
    }
}
