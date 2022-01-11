package day21_ArraysAndForEachLoop;
//arrays.sort   //arrays.equal //copy
import java.util.Arrays;

public class ArrayUtility1 {
    public static void main(String[] args) {


        int[] nums = {1,2,3,4,5};

        System.out.println(nums); // this will print hashcode
        System.out.println(Arrays.toString(nums)); // only use it when you want to print the whole array
        // 1, 2, 3, 4, 5;
        System.out.println(nums[0]); //this is just an elements will print index 0

        //sort ascends the array from smallest to largest

        int scores [] = { 95, 100, 55 ,65 ,85 ,75};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Min Scored: " + scores[0]);
        System.out.println("Max Scores: " + scores[scores.length-1]);

//-----------------------------------------------------------------

        String names [] = {"David", "Alexander", "Julian", "Beatrix", "Robert"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        String words[] = {"Anna" , "ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));


        //-------------------------------------


        int arr1 [] = {1,3,2};
        int arr2[] = {1,2,3};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r1  = Arrays.equals(arr1,arr2);

        System.out.println(r1);


//----------------------------------------------

        char ch1 [] = {'a', 'c', 'b'};
        char ch2 [] = {'b', 'a', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println("anagram = " + anagram);

        //------------------------------------------------













    }
}
