package day25_CustomMethodOverloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};

        ArraysUtility.PrintEachElement(arr1);

        int [] a1 = {1,2,3,4,5,6,7,7,8};

      boolean result =  ArraysUtility.contains(a1,5);
        System.out.println(result);

        int arr6 [] = {1,1,2,3,4,5,6,3,3,6,6,6,6,6,6};

        int freq =  ArraysUtility.frequencyOfElement(arr6,6);

    }



}
