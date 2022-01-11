package day29_ArrayLstandCollectionsUtility;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters7 {
    public static void main(String[] args) {
        //converting string to arraylist

        String str = "aaabcccdeeef";

       String [] arr = str.split("");

       ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println(list);

        String unique = "";

        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if(frequency==1){
                unique+=each;
            }

        }
        System.out.println(unique);


    }
}
