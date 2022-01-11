package day28_ArrayList;

import java.util.ArrayList;

/*2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1]; */
public class DinnerTask2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.set(0, 5);
        numbers.set(4, 1);
        System.out.println(numbers);

    }
}
