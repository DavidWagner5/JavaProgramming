package day29_ArrayLstandCollectionsUtility;
//removeIf method
import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        list.removeIf( p -> p < 5); //lambda expression
        System.out.println(list);

        //---------------------------------------------


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));



        list2.removeIf(each -> each%2==0 );
        System.out.println(list2);



        //-------------------------------------------

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "Java", "Java"));

        list3.removeIf(each -> each.startsWith("J"));


        System.out.println(list3);
        //--------------------------------------------

        ArrayList<String> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList("Anna", "racecar", "Level", "Eye", "Java", "Python", "Cydeo"));
        list4.removeIf(each -> !StringUtility.isPalindrome(each));
        System.out.println(list4);
    }
}
