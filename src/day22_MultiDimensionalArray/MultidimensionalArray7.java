package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultidimensionalArray7 {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 5, 6};
        int arr3[] = {7, 8, 9};

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //3 dimensional array contians 2 dimensional arrays


        //                          0       1        2         0              1           2
        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}};
        //  index of 2darry      0                                   1

        System.out.println(Arrays.deepToString(arr3D[1])); //{10,20,30}, {40,50,60} , {70,80,90}}};

        System.out.println(Arrays.toString(arr3D[1][1])); // {40,50,60}

        System.out.println(arr3D[0][2][2]);//9

//--------------------------------------------------------------------------------------------------
        for (int[][] each2D : arr3D) {
            for (int[] eachArray : each2D) {
                for (int eachElement : eachArray) {
                    System.out.print(eachElement + " ");

                }

            }

        }


        //-------------------------------------------

        int[][][][] arr4D = {{{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}}};
//index of 3 dimensional array                                  0

        for (int[][][] each3D : arr4D) {
            for (int[][] Each2D : each3D) {
                for (int[] Each1D : Each2D) {
                    for (int Elements : Each1D) {
                        System.out.println(Elements);

                    }

                }

            }

        }

        }
    }

