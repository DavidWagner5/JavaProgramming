package day53_FunctionalInterface_Stream;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    // when you use stream, you will most likely be chaining the methods together
    //to use stream with collection type, you need to write .collect
    //to use stream with arrays, you need to write .toArray
    //methods: distinct, collect, skip, limit, map, filter, count, forEach, all match, any match, none match

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));

       list1 = list1.stream().distinct().collect(Collectors.toList());

        System.out.println(list1);



        //-------------------------------

        int[] arr1 = {1,1,2,2,3,3,4,4,4,5};
       arr1 = Arrays.stream(arr1).distinct().toArray();

        System.out.println(Arrays.toString(arr1));


        //---------------------------------



        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

       list2 =  list2.stream().skip(5).collect(Collectors.toList()); //first 5 elements will be skipped

        System.out.println(list2);


        //-------------------------------------------------

        int[] nums2 = {1,2,3,4,5,56,6,7,7,};
        Arrays.stream(nums2).skip(4).toArray();

        System.out.println(Arrays.toString(nums2));

        //-------------------------


        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,6,7,7,7,8,8,8,9));
        list3 = list3.stream().limit(7).skip(3).collect(Collectors.toList());

        System.out.println(list3);


        //----------------------------

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list4 = list4.stream().map(p -> p*10).collect(Collectors.toList()); //map method asks you to pass lambda expression

        System.out.println(list4);


        //---------------------------

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        List<Integer> evens = list5.stream().filter(p -> p%2==0).collect(Collectors.toList()); //filter asks for lamba expression

        System.out.println(evens);


        //---------------------------

        List<String> list6 = new ArrayList<>(Arrays.asList("David", "Java", "JAVA", "jaVa", "RUBY"));

        double countJava = list6.stream().filter(p -> p.equalsIgnoreCase("java")).count();


        System.out.println(countJava);

        //or

        list6.stream().filter(p -> p.equalsIgnoreCase("java")).forEach(p -> System.out.println(p));

        //--------------------------------------------

        List<Integer> list7 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));


        boolean r1 = list7.stream().allMatch(p -> p%2==0); //do all of these match the lamba expression?
        System.out.println(r1);

        boolean r2 = list7.stream().anyMatch(p -> p>20); //do any of these match?
        System.out.println(r2);

        boolean r3 = list7.stream().noneMatch(p -> p>20); //do none of these match?
        System.out.println(r3);






    }
}
