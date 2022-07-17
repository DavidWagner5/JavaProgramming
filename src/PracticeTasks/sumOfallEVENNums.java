package PracticeTasks;

import java.util.Scanner;

public class sumOfallEVENNums {

    public static void main(String[] args) {


        System.out.println(sumEvenNums(5));


        System.out.println((sumEvenNums(5,10)));

    }


    public static int sumEvenNums(int num) {



            int sum = 0;


            for (int i = 1; i <= num; i++) {

                if (i % 2 == 0) {

                    sum = sum + i;

                }
            }



        return sum;



    }


    public static int sumEvenNums(int num1, int num2){

        int sum = 0;

        for (int i = num1; i <= num2; i++) {

            if (i % 2 == 0) {


                sum = sum + i;

            }
        }
        return sum;
    }
}
