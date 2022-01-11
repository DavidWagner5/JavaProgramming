package day21_ArraysAndForEachLoop;

import java.util.Arrays;

public class TaskReverseArray13 {
    public static void main(String[] args) {

        int numbers [] = {10,20,30,40,50};

        int [] reversed = new int [numbers.length];

/*
        reversed[0] = numbers[numbers.length-1];
        reversed[1] = numbers[2];
        reversed[2]= numbers[1];
        reversed[3] = numbers[0];

        System.out.println(Arrays.toString(reversed));*/


        for (int i = numbers.length - 1, j=0;  i >= 0; i--, j++) {
            reversed[j] = numbers[i];


        }

        System.out.println(Arrays.toString(reversed));


        int revrsed = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {

            for (int j = 0; j < numbers[i]; j++) {





            }

            System.out.print(numbers[i]+ " ");



        }



        }


    }

