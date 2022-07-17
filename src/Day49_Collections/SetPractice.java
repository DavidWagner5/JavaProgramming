package Day49_Collections;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        String [] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        Set<String> set1 = new HashSet<>(Arrays.asList(arr)); //print hashset order


        arr = set1.toArray(new String[0]); //converted back to array


        System.out.println(set1);
        System.out.println(Arrays.toString(arr));

        //----------------------------------------------------------------

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000,300,1000,200,300,400,550,500,600,10,10,20,30,40,30,20,10));

        list = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println(list);



        //-------------------------
        String str = "aaaabbbbccccdddeeeee";

        String result = ""; //a4b4c4d3e5

        for (String each : new LinkedHashSet<> (Arrays.asList(str.split("")))){
            result += each + Collections.frequency(Arrays.asList(str.split("")), each);
        }

        System.out.println(result);


        //------------------------------------------------------



    }
}
