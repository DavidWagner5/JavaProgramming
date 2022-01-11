package day27_CustomMethodAndWrapperClasses;

import java.util.Arrays;

public class ReplaceAllMethod2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
       arr =  replaceAll(arr, 3, 9 );
        System.out.println(Arrays.toString(arr));

    }


    //replaces all the matching int elements in an array with new elements
    public static int [] replaceAll(int [] arr, int oldvalue, int newvalue){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == oldvalue){
                arr[i] = newvalue;
            }
        }

        return arr;
    }

    //replaces all the matching double elements in an array with new elements
    public static double [] replaceAll(double [] arr, double oldvalue, double newvalue){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == oldvalue){
                arr[i] = newvalue;
            }
        }

        return arr;
    }

    //replaces all the matching char elements in an array with new elements
    public static char [] replaceAll(char [] arr, char oldvalue, char newvalue){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == oldvalue){
                arr[i] = newvalue;
            }
        }

        return arr;
    }

    //replaces all the matching String elements in an array with new elements
    public static String [] replaceAll(String [] arr, String oldvalue, String newvalue){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == oldvalue){
                arr[i] = newvalue;
            }
        }

        return arr;
    }
}
