package day22_MultiDimensionalArray;

import java.util.Arrays;

//single dimensional = container to store data for elements only int  array [] = {10,20,30}
//multi dimensional =  container for the arrays. in order to use it you need multiple one dimensional arrays.
public class MultidimensionalArray3 {
    public static void main(String[] args) {

        String group1 [] = {"David", "joes", "James"};
        String group2 [] = {"David", "joes", "James"};
        String group3 [] = {"David", "joes", "James"};

       String groups [] [] = new String [3] []; //index : 0,1,2
        groups [0] = group1;
        groups[1] = group2;
        groups[2] = group3;


        System.out.println(Arrays.deepToString(groups)); //use deeptostring to display multidimensional arrays


        //------------------------------------------------

       // int numbers1 [] = {1,2,3};
       // int numbers2 [] = {4,5,6,7};
       // int numbers3 [] = {8,9,10,11,12};


        //index of elements    0 1 2   0 1 2 3   0 1 2 3 4
            int [][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //index of arrays        0        1          2

        System.out.println(Arrays.deepToString(arr2D));//whole thing
        System.out.println(Arrays.toString(arr2D[1]));//just index 1
        System.out.println(arr2D[2][3]); //this will get me 11



    }
}
