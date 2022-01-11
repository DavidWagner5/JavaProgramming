package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArrays5 {
    public static void main(String[] args) {

        int [][] arr2D = {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

        for (int i = arr2D.length - 1; i >= 0; i--) {  //index of arrays, NOT ELEMENTS, so it starts from 9,10,11,12,13

            for (int j = 0; j < arr2D[i].length; j++) { // j is index of elements of all the single arrays from array index 0

                System.out.print(arr2D[i][j]+ " ");

            }
            System.out.println();

        }


        for (int i = 0; i < arr2D.length; i++) {

            for (int j = arr2D[i].length - 1; j >= 0; j--) {

                System.out.print(arr2D[i][j]+ " ");

            }
            System.out.println();
        }


        for (int i = arr2D.length - 1; i >= 0; i--) {

            for (int j = arr2D[i].length - 1; j >= 0; j--) {

                System.out.print(arr2D[i][j]+ " ");

            }

            System.out.println();

        }
        
    }
}
