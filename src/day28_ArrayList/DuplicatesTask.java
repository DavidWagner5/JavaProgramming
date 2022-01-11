package day28_ArrayList;
import utilities.ArraysUtility;
import java.util.ArrayList;
import java.util.Arrays;

/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2 */
public class DuplicatesTask {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));
        int freq = 0;
        int FirstDuplicate = 0;

        for (Integer each : list) {

            for (Integer element : list) {
                if(each == element){
                    freq++;
                }

            }
            if(freq > 1){
                FirstDuplicate=each;
                break;
            }

        }
        System.out.println(FirstDuplicate);
    }
}
