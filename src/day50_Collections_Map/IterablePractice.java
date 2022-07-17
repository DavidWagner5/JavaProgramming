package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //remove all elements that are less than 4

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4){
                list.remove(i);
            }

        }

        System.out.println(list); //this will not remove the elements proeprly




        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //remove all the elements less than 4

        Iterator<Integer> it = list2.iterator();

        boolean r1 = it.hasNext(); //checks if the element is present

        while(it.hasNext()){
            if(it.next() < 4){
                it.remove();
            }
        }

        System.out.println(list2);


        //---------------------------------------

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list3.removeIf(p -> p < 4);

        System.out.println(list3);



        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "ahmed", "John", "Ercon", "Daniel", "Mustafa", "Mohammed"));

        //remove all the ahmeds

        Iterator<String> it1 = names.iterator();

        while(it1.hasNext()){
            if(it1.next().equalsIgnoreCase("ahmed"));
            it1.remove();
        }


        System.out.println(names);


    }




}
