package day28_ArrayList;
/*6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1 */
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListminTask {
    public static void main(String[] args) {

        int min = 100;

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        for (Integer each : list) {
            if(each<min){
                min = each;
            }
        }
        System.out.println(min);


    }

}
