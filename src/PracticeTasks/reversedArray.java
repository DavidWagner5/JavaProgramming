package PracticeTasks;

import java.util.Arrays;

//Write a program that can reverse an array of integers and returns it as a new array
public class reversedArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        int [] reversedArray = new int[array.length];

        for (int i = array.length - 1, j =0; i >= 0; i--, j++) {

            reversedArray[j] = array[i];

        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
