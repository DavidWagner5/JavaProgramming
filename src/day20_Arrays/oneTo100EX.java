package day20_Arrays;

import java.util.Arrays;

public class oneTo100EX {
    public static void main(String[] args) {

        int number[] = new int[100];

        int o = 100;

        for (int i = 0; i<number.length; i++) {
            number[i] = o--;





        }
        System.out.println(Arrays.toString(number));
        int p = 1;

        for (int i = 0; i < number.length ; i++) {
            number[i] = p++;

        }


        System.out.println(Arrays.toString(number));
    }
}
