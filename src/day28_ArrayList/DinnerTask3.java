package day28_ArrayList;

import java.io.FilterOutputStream;
import java.util.ArrayList;

/*3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]*/
public class DinnerTask3 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : numbers) {
            if(!(each%2==0)){
                System.out.println(each*2);


            }



        }



        }
    }

