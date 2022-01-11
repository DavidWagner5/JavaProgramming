package day22_MultiDimensionalArray;

import java.util.Arrays;

public class TotalOddandEven9 {
    public static void main(String[] args) {

        int[][] numbers = {{2, 5, 17}, {65, 12, 4}};

        int countEven = 0;
        int countOdd = 0;

        for (int[] arr2D : numbers) {
            for (int elements : arr2D) {

                if (elements % 2 == 0) {
                    countEven++;
                }
                if (!(elements % 2 == 0)) {
                    countOdd++;
                }

            }


        }
        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);

    }
}
