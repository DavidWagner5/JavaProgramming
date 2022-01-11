package day29_ArrayLstandCollectionsUtility;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilityMethods5 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println(list);





        //----------------------------------------

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        //-------------------------------------------
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));

        Collections.swap(list3, 4, 1);
        System.out.println(list3);



        //----------------------------------

        int max = Collections.max(list3);
        int min = Collections.min(list3);

        //----------------------------------

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list4, 10, 1000);
        System.out.println(list4);

        //----------------------------------

        int frequency = Collections.frequency(list4, 1000);
        System.out.println(frequency);

        //-----------------------------------

        ArrayList<String> owrd = new ArrayList<>();
        owrd.addAll(Arrays.asList("Java", "Java", "Python", "Python","Ruby", "C#"));

        int countJava = Collections.frequency(owrd, "Java");

        System.out.println(countJava);


    }
}
