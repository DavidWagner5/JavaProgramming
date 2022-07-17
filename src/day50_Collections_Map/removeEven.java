package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeEven {

    public static void main(String[] args) {


        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,100,90,80,70,45,25,35,15));

        set.removeIf(p -> p % 2 ==0);

        System.out.println(set);
    }
}
