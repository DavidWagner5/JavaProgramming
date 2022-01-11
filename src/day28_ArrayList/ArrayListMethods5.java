package day28_ArrayList;
//multiply array list by 2
import java.util.ArrayList;

public class ArrayListMethods5 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        for (int i = 0; i < numbers.size(); i++) {

            numbers.set(i , numbers.get(i)*2);
        }
        System.out.println(numbers);
        //--------------------------------------------------
        // remove method
        numbers.remove(2);
        System.out.println(numbers);

        //clear method
        //removes all the elements in the array
        numbers.clear();
        System.out.println(numbers);


        
        
    }
}
