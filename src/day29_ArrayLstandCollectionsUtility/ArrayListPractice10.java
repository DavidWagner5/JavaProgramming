package day29_ArrayLstandCollectionsUtility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice10 {
    public static void main(String[] args) {
        //remove all names but ahmed and david

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron","ahmed ", "David", "Shay"));

        employees.retainAll(Arrays.asList("Ahmed", "David"));

        System.out.println(employees);

        //----------------------------

        //remove all names that start with m
        String [] names = {"Mary", "Monica", "David"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p -> p.startsWith("M"));

        System.out.println(list);

        names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));
    }
}
