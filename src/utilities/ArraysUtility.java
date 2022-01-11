package utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {





    }

    //prints each integer of an integer array in lines
    public static void PrintEachElement(int[] array){
        for (int each : array) {
            System.out.println(each);

        }
    }
    //print each double of a double array in lines
    public static void PrintEachElement(double[] array){
        for (double each : array) {
            System.out.println(each);

        }
    }

    //print each char of a char array in lines
    public static void PrintEachElement(char[] array){
        for (char each : array) {
            System.out.println(each);

        }
    }

    //print each String of a String array in lines
    public static void PrintEachElement(String[] array){
        for (String each : array) {
            System.out.println(each);

        }
    }

    //returns the max num from an int array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers [numbers.length-1];
    }

    //returns the max num from a double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers [numbers.length-1];
    }

    //return the min num from an int array
    public static int min(int[]numbers){
        return numbers[0];
    }

    //return the min num from a double array
    public static double min(double[]numbers){
        return numbers[0];
    }

    //checks if the given integer is contained in the given array. returns boolean. contains (int[], int)
    public static boolean contains (int[] array, int element){
        boolean result = false;

        for (int each : array) {
            if(each==element){
                result = true;
            }

        }
        return result;
    }


    //checks if the given double is contained in the given array. returns boolean
    public static boolean contains (double[] array, double element){
        boolean result = false;

        for (double each : array) {
            if(each==element){
                result = true;
            }

        }
        return result;
    }


    //checks if the given char is contained in the given array. returns boolean
    public static boolean contains (char[] array, char element){
        boolean result = false;

        for (char each : array) {
            if(each==element){
                result = true;
            }

        }
        return result;
    }


    //checks if the given String is contained in the given array. returns boolean
    public static boolean contains (String[] array, String element){
        boolean result = false;

        for (String each : array) {
            if(each==element){
                result = true;
            }

        }
        return result;
    }


    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int [] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;

    }


    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element){
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
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //3. create a return method called addchar that can add a String after the last index of a char array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //returns the frequency of the int element
    public static int frequencyOfElement(int [] array, int element){

        int freq = 0;

        for (int each : array) {

            if(each == element){
                freq++;
            }



        }

        return freq;
    }


    //returns the frequency of the char element
    public static int frequencyOfElement(char [] array, char element){

        int freq = 0;

        for (char each : array) {

            if(each == element){
                freq++;
            }



        }

        return freq;
    }


    //returns the frequency of the double element
    public static int frequencyOfElement(double [] array, double element){

        int freq = 0;

        for (double each : array) {

            if(each == element){
                freq++;
            }



        }

        return freq;
    }


    //returns the frequency of the String element
    public static int frequencyOfElement(String [] array, String element){

        int freq = 0;

        for (String each : array) {

            if(each.equals(element)){
                freq++;
            }



        }

        return freq;
    }

    //returns the unique elements of an array as a new int array
    public static int [] uniqueElements (int [] array){
        int [] result = {};

        for (int each : array) {

            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    //returns the unique elements of an array as a new double array
    public static double [] uniqueElements (double [] array){
        double [] result = {};

        for (double each : array) {

            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    //returns the unique elements of an array as a new char array
    public static char [] uniqueElements (char [] array){
        char [] result = {};

        for (char each : array) {

            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    //returns the unique elements of an array as a new String array
    public static String [] uniqueElements (String [] array){
        String [] result = {};

        for (String each : array) {

            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result = ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }

    //removes the index from the int array and returns new int array
    public static int[] removeElements(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }
        int[] result = new int[array.length - 1];


        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }

        return result;


    }

    //removes the index from the double array and returns new double array
    public static double[] removeElements(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }
        double[] result = new double[array.length - 1];


        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }

        return result;


    }

    //removes the index from the char array and returns new char array
    public static char[] removeElements(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }
        char[] result = new char[array.length - 1];


        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }

        return result;


    }

    //removes the index from the String array and returns new String array
    public static String[] removeElements(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }
        String[] result = new String[array.length - 1];


        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }

        return result;


    }

    //merges the given two int arrays and returns the new array
    public static int[] merge(int [] arr1, int [] arr2){
        int [] result = {};

        for (int each : arr1) {
            result = addElement(result,each);

        }

        for (int each : arr2) {
            result = addElement(result,each);

        }

        return result;
    }

    //merges the given two char arrays and returns the new array
    public static char[] merge(char [] arr1, char [] arr2){
        char [] result = {};

        for (char each : arr1) {
            result = addElement(result,each);

        }

        for (char each : arr2) {
            result = addElement(result,each);

        }

        return result;
    }

    //merges the given two double arrays and returns the new array
    public static double[] merge(double [] arr1, double [] arr2){
        double [] result = {};

        for (double each : arr1) {
            result = addElement(result,each);

        }

        for (double each : arr2) {
            result = addElement(result,each);

        }

        return result;
    }

    //merges the given two String arrays and returns the new array
    public static String[] merge(String [] arr1, String [] arr2){
        String [] result = {};

        for (String each : arr1) {
            result = addElement(result,each);

        }

        for (String each : arr2) {
            result = addElement(result,each);

        }

        return result;
    }
    
    //reverses the given array and returns a new array
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {

            result[j] = array[i];
        }
        return result;
    }

    //reverses the given double array and returns a new array
    public static double[] reverse(double[] array){
        double[] result = new double[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {

            result[j] = array[i];
        }
        return result;
    }

    //reverses the given char array and returns a new array
    public static char[] reverse(char[] array){
        char[] result = new char[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {

            result[j] = array[i];
        }
        return result;
    }

    //reverses the given String array and returns a new array
    public static String[] reverse(String[] array){
        String[] result = new String[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {

            result[j] = array[i];
        }
        return result;
    }

    //replaces an int element in an array with another element
    public static int [] replace(int[] array, int index, int newElement){
        if(index<0 || index > array.length-1){
            System.err.println("invalid index");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces a double element in an array with another element
    public static double [] replace(double[] array, int index, double newElement){
        if(index<0 || index > array.length-1){
            System.err.println("invalid index");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces a char element in an array with another element
    public static char [] replace(char[] array, int index, char newElement){
        if(index<0 || index > array.length-1){
            System.err.println("invalid index");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces a string element in an array with another element
    public static String [] replace(String[] array, int index, String newElement){
        if(index<0 || index > array.length-1){
            System.err.println("invalid index");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
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

    //remove duplicates from int array
    public static int [] removeDuplicates(int [] array){

        int [] result = {};

        for(int each:array){
            if(!ArraysUtility.contains(result, each)){
                result =  ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //remove duplicates from double array
    public static double [] removeDuplicates(double [] array){

        double [] result = {};

        for(double each:array){
            if(!ArraysUtility.contains(result, each)){
                result =  ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //remove duplicates from char array
    public static char [] removeDuplicates(char [] array){

        char [] result = {};

        for(char each:array){
            if(!ArraysUtility.contains(result, each)){
                result =  ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //remove duplicates from String array
    public static String [] removeDuplicates(String [] array){

        String [] result = {};

        for(String each:array){
            if(!ArraysUtility.contains(result, each)){
                result =  ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
  //converting a primitive array to an ArrayList! Then you can use the arraylist methods and collection methods
    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);


        }
        return list;
    }


}
