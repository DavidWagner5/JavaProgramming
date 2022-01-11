package day25_CustomMethodOverloading;
/* to add an element to an array you must create a new one because arrays are fixed.*/

import java.util.Arrays;

public class AddElementsToArray2 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        arr = addsomething(arr, 5); //{1,2,3,4,5}

        System.out.println(Arrays.toString(arr));

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        arr2 = addsomething(arr2, 5.5); // {1.5, 2.5, 3.5, 4.5, 5.5}

        System.out.println(Arrays.toString(arr2));


        String[] names = {"Tatiana", "Oleksandr", "Cassandra", "Ali"};  //"Neira"

        names = addsomething(names, "Neira");  //{"Tatiana", "Oleksandr", "Cassandra", "Ali", "Neira"}

        names = addsomething(names, "Igor");

        System.out.println(Arrays.toString(names));




    }

    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int[] addsomething(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addsomething(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addsomething(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    public static char[] addsomething(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    /*
Task2:
		1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}
	    2. create a return method called addDouble that can add a double after the last index of a double array
	    3. create a return method called addString that can add a String after the last index of a String array
	    4. create a return method called addChar that can add a char after last index of a char array
 */












































}
