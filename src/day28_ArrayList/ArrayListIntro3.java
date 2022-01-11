package day28_ArrayList;

import java.util.ArrayList;

/* Arraylist is a part of the collections heirarchy. It is a grandchild of collection
* you cannot add or remove elements from the same array object
* ArrayList MUST be imported at the top java.util.ArrayList
ArrayList can ONLY use wrappers*/

public class ArrayListIntro3 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        System.out.println(numbers);
        System.out.println(names);

    }
}
