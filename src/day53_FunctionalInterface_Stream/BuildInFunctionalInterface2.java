package day53_FunctionalInterface_Stream;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterface2 {
    //BIPREDICATE accepts two arguments and returns boolean, BICONSUMER takes two arguments and does not return a value, BIFUNCTION

    public static void main(String[] args) {

        //create a function that can check if the integer is contained in an array of an integer

        BiPredicate<Integer[], Integer> contains = (a, b) -> {
            boolean result = false;

            for (Integer each : a) {
                if (each == b) {
                    result = true;
                    break;
                }

            }

            return result;
        };

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean result = contains.test(arr, 11);
        System.out.println(result);


        //-------------------------------------
        //create function that can check if two string are anagram

        BiPredicate<String, String> anagram = (s1, s2) -> {

            String[] arr1 = s1.split("");
            String[] arr2 = s2.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);

        };

        //create a function that can print the given string for a given number of times

        BiConsumer<String, Integer> multiplePrintString = (s3, s4) -> {

            for (Integer i = 0; i < s4; i++) {
                System.out.println(s3);

            }
        };

        multiplePrintString.accept("java", 5);


        //----------------------------------------
        //create a function that can take first and last names and return the formatted full name

        BiConsumer<String, String> formatNames = (f, l) ->
                System.out.println(f.substring(0, 1).toUpperCase() + f.substring(1).toLowerCase() + " " + l.substring(0, 1).toUpperCase() + l.substring(1).toLowerCase());

        formatNames.accept("jAvA", "PROGRAMMING");


        //---------------------------------------------

        //print out all of the keys and value of a map


        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid", "SM");
        scrumTeam1.put("Nikita", "Developer");
        scrumTeam1.put("David", "SDET");

        scrumTeam1.forEach((k, v) -> System.out.println(k + " : " + v));


        //create the function that takes two integers and returns the maximum integer

        BiFunction<Integer, Integer, Integer> maxNum = (a, b) ->
                (a > b) ? a : b;

        int max = maxNum.apply(100, 200);

        System.out.println(max);


        //---------------------------------------------


        //create a function that can merge two integer arrays into a list
        BiFunction<int[], int[], List<Integer>> merge = (x, y) -> {

            List<Integer> result5 = new ArrayList<>();

            for (int each : x) {
                result5.add(each);

            }

            for (int each : y) {
                result5.add(each);

            }

            return result5;


        };

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};

        List<Integer> nums = merge.apply(arr1, arr2);
        System.out.println(nums);


        //-------------------------------------


        //create a function that takes a list of string and list of integer and put in a map

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> merge2ListsToMap = (j, k) -> {

        Map<String, Integer> map = new HashMap<>();//we just used hashmap since its fast

            for (int i = 0; i < j.size(); i++) {
                map.put(j.get(i), k.get(i));
            }
            return map;

        };

        List<String> names = new ArrayList<>(Arrays.asList("David", "David", "David"));
        List<Integer> scores= new ArrayList<>(Arrays.asList(90,90,90));

        Map<String, Integer> students = merge2ListsToMap.apply(names, scores);
        System.out.println(students);




    }
}


