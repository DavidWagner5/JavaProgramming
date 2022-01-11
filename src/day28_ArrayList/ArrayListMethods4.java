package day28_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListMethods4 {
    public static void main(String[] args) {
    //add method //size method //get method //set method
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //index 0
        numbers.add(20); //1
        numbers.add(30); //2
        numbers.add(40); //3
        numbers.add(50); //4
        numbers.add(60); //5

        numbers.add(2, 25); //you can insert with this
        numbers.add(5, 45);

        int lastindex = numbers.size()-1;// will find the last index size

        System.out.println(numbers);
        System.out.println(lastindex);

        int num = numbers.get(3);
        System.out.println(num);

        //---------------------------

        for (int i = 0; i < numbers.size() ; i++) {
            System.out.println(numbers.get(i));

        }

        //---------------------------------
    // set method replaces the element with new element
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");


        System.out.println(list);

        list.set(3, "C++");
        System.out.println(list);

        //-----------------------------

    }
}
