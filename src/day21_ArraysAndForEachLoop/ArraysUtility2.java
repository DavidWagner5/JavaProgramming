package day21_ArraysAndForEachLoop;

import java.util.Arrays;

//copyOf
public class ArraysUtility2 {
    public static void main(String[] args) {

        String [] students = {"Elif" , "Sinem", "Gunay", "Cihad", "David", "James"};
        String [] earlybirds = Arrays.copyOf(students, 30); // 30 is used for the range or length of what is to be copied

        System.out.println(Arrays.toString(earlybirds)); //[Elif, Sinem, Gunay, Cihad, David, James, l, null, null, null, null, null, null, null, null, null xwhatever the remainding ones
        // are]

        //------------------------------------------------------------------------------------

        int numbers [] = {1,2,3,4,5,67,8,9,10};

        numbers = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(numbers)); //1,2,3,4,5

        //--------------------------------------

        char ch1 [] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        ch1 = Arrays.copyOfRange(ch1 , 2, 6);  //c to f like substring
        System.out.println(Arrays.toString(ch1));

        //-------------------------------------

        int scores [] = {10,20,30,40,50,60,70,80,90,100};
        int result [] = Arrays.copyOfRange(scores , 3, 8);
        System.out.println(Arrays.toString(result));



    }
}
