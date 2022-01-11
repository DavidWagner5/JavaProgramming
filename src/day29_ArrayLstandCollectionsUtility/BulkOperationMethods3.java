package day29_ArrayLstandCollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;

//add all
//remove all
//retain all
//contains all
public class BulkOperationMethods3 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        //---------------------------------------

        list.removeAll(Arrays.asList(3,5,8));

        //---------------------------------------
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        numbers.retainAll(Arrays.asList(100,200,300)); //it deletes the rest of the numbers but keeps these because I ask to retain them.

        //---------------------------------------


        ArrayList<String> jobtitles = new ArrayList<>();
        jobtitles.addAll(Arrays.asList("QA", "Sdet", "Developer","Scrum Master", "SDET", "BA", "BA"));
        jobtitles.retainAll(Arrays.asList("QA" , "SDET"));
        System.out.println(jobtitles);

        //----------------------------------------

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));
        boolean r1 = nums.contains(10);
        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        //or
        boolean r3 = nums.containsAll(Arrays.asList(2,5,10));
        System.out.println("r3 = " + r3);

        //-----------------------------------------

        String [] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};
        ArrayList <String> namesList = new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList);

        //------------------------------------------

        Integer [] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(nums1);




    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);


        }
        return list;
    }
}
