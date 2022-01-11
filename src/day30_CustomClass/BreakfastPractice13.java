package day30_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*1. write a program that can swap the first and last elements of an ArrayList of Integers*/
public class BreakfastPractice13 {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Collections.swap(list, 0, list.size() - 1);

        System.out.println(list);



        /*2. Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]*/


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer each : list2) {
            if (each != 0) {
                newList.add(each);
            }
        }

        for (Integer each : list2) {
            if (each == 0) {
                newList.add(each);
            }
        }

        System.out.println(newList);




        /*3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !} */


        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));

        }

        ArrayList<Character> letters = new ArrayList<>(chars);
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(chars);
        letters.removeIf(p -> !Character.isDigit(p));
        System.out.println("digits = " + digits);

        ArrayList<Character> specialchar = new ArrayList<>(chars);
        specialchar.removeAll(letters);
        specialchar.removeAll(digits);
        System.out.println("specialchar = " + specialchar);






    }
}




















