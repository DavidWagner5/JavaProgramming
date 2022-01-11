package day29_ArrayLstandCollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;

//remove countries with 10 or more characters
public class ArrayListPractice9 {
    public static void main(String[] args) {

        String [] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada",};

        //convert this array to arraylist to get the arraylist methods

        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p -> p.length() >= 10);

        //now convert arrayList back to an Array

      countries =  list.toArray(new String[0]);

      System.out.println(Arrays.toString(countries));


    }
}
