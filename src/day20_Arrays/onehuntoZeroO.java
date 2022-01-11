package day20_Arrays;

import java.util.Arrays;

public class onehuntoZeroO {
    public static void main(String[] args) {

        int number[] = new int[100];

        int o = 100;

        for (int i = 0; i < number.length; i++) {
            number[i] = o--;

        }
        System.out.println(Arrays.toString(number)
        );
    }
}
