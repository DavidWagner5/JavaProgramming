package day26_CustomMethodsPuttinginUtilities;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElementsArray {

    public static void main(String[] args) {
     int [] array = {1,2,3,4,5,4,4,4,4,4};

     int [] unique = uniqueElements(array);

        System.out.println(Arrays.toString(unique));



        String [] array2 = {"David wagner", "David wagner", "Lara"};
        String [] unique2 = ArraysUtility.uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));

        int [] numbers = {100,200,300,400,500,600};
        numbers = removeElements(numbers,1);

        System.out.println(Arrays.toString(numbers));
    }

    public static int [] uniqueElements (int [] array){
        int [] result = {};

        for (int each : array) {

            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    public static int[] removeElements(int[] array, int index){

        if(index<0 || index > array.length-1){
            System.err.println("Invalid index " + index);
            System.exit(0);
        }
        int [] result = new int[array.length -1];


        int j = 0;
       for(int i = 0; i < array.length; i++) {

            if(i==index){
                continue;
            }
            result[j++] = array[i];
        }

        return result;
    }
    }

