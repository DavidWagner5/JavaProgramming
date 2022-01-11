package day27_CustomMethodAndWrapperClasses;

import java.util.Arrays;

/* pass 3 parameters array index element */
public class ReplaceMethod1 {
    public static void main(String[] args) {
int [] arr = {1,2,3,4,5};
arr = replace(arr, 2, 30);
        System.out.println(Arrays.toString(arr));


    }

    public static int [] replace(int[] array, int index, int newElement){
        if(index<0 || index > array.length-1){
            System.err.println("invalid index");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static double [] replace(double[] array, int index, double newElement){
        if(index<0 || index > array.length-1){
            System.err.println("invalid index");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static char [] replace(char[] array, int index, char newElement){
        if(index<0 || index > array.length-1){
            System.err.println("invalid index");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static String [] replace(String[] array, int index, String newElement){
        if(index<0 || index > array.length-1){
            System.err.println("invalid index");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
}

