package day29_ArrayLstandCollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseBothTypesOfArrays8 {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};
        int [] result = new int[arr.length];

        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--, j++) {
           result[j] = arr[i];

        }
        System.out.println(Arrays.toString(result));

        //-------------------------------------------------


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            int each = list.get(i);
            reversedList.add(each);



        }
        System.out.println(reversedList);




    }
}
