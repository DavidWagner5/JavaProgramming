package day28_ArrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

//unique element
public class ArrayListMethods6 {
    public static void main(String[] args) {
//lasindex and index of method //contains method
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");

        System.out.println(list);

        ArrayList<String> unique = new ArrayList<>();

        for (String each : list) {
            if(list.indexOf(each)== list.lastIndexOf(each)){
                unique.add(each);
            }

        }
        System.out.println(unique);


        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(10);
        nums.add(10);
        nums.add(20);
        nums.add(20);
        nums.add(20);
        nums.add(30);
        nums.add(30);
        nums.add(30);
        nums.add(30);
        nums.add(30);
        nums.add(30);

        ArrayList<Integer> result = new ArrayList<>();


        for (Integer each : nums) {
            if(result.contains(each)){
                continue;
            }

            result.add(each);

        }
        System.out.println(result);
        //is empty method

        boolean r4 = nums.isEmpty();
        System.out.println(r4);


        ArrayList<Integer> numbers = new ArrayList<>();
        //bulk operation "ALL": Collection type
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(numbers);











    }


}
