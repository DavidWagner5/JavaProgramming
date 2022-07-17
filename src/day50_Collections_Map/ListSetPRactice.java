package day50_Collections_Map;



import java.util.*;

public class ListSetPRactice {


    public static void main(String[] args) {
//converting set to list

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);

        List<Integer> list  = new ArrayList<>(set);


        //---------------------------------------


        List<Character> chars = new Stack<>();

        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));
        System.out.println("chars = " + chars);

       //pop method = LIFO
        ( (Stack)chars).pop();


        System.out.println("chars = " + chars);

        //poll method = FIFO
        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        ((LinkedList<String>) names).poll();

        System.out.println("names = " + names);











    }
}
