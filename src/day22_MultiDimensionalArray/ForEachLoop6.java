package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop6 {
    public static void main(String[] args) {


        int [][] arr2D = {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};  //you cant use for each loop to change order and shit. only from beginning to end, normally


        for (int[] each1DArray : arr2D) {

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);

            }

        }





    }
}
